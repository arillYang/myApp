/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TgroupdiscountController
 * Author:   PanYin
 * Date:     2018/11/2 10:38
 * Description: 团购优惠
 */
package com.xuyang.controller.homepage;

import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.GroupsMapper;
import com.xuyang.mapper.TgtypeMapper;
import com.xuyang.model.*;
import com.xuyang.mould.GoodsEvaluate;
import com.xuyang.mould.GoodsToImages;
import com.xuyang.mould.GroupsToItem;
import com.xuyang.service.GoodsEvaluateService;
import com.xuyang.service.GoodsToImagesService;
import com.xuyang.service.GroupsToItemService;
import com.xuyang.service.TgoodsService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈团购优惠〉
 *
 * @author PanYin
 * @create 2018/11/2
 * @since 1.0.0
 */
@Api(description = "团购优惠")
@RestController
@RequestMapping(value = "/group")
public class TgroupdiscountController {
    //商品类型service
    @Autowired
    private TgtypeMapper tgtypeMapper;
    //商品service
    @Autowired
    private TgoodsService tgoodsService;
    //商品详情service
    @Autowired
    private GoodsToImagesService goodsToImagesService;
    //商品评论
    @Autowired
    private GoodsEvaluateService goodsEvaluateService;
    //团购
    @Autowired
    private GroupsToItemService groupsToItemService;

    @ApiOperation(value = "查询类型")
    @RequestMapping(value = "/queryType", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    @ResponseBody
    public Object queryGroupType() {
        TgtypeExample example = new TgtypeExample();
        TgtypeExample.Criteria criteria = example.createCriteria();
        criteria.andGtIdIsNotNull();
        List<Tgtype> tgtypes = tgtypeMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok, "", tgtypes);
    }

    @ApiOperation(value = "查询商品")
    @ResponseBody
    @RequestMapping(value = "/bestArrivals", method = RequestMethod.GET)
    public Object queryBestGoos(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                    int pageSize,String sale) {
        PageInfo<Tgoods> info = tgoodsService.pagingQueryGoods(pageNum, pageSize,sale);
        if (info == null) {
            return XuYangResult.ok(ResultConstant.code_failue, "没有数据", null);
        } else {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", info);
        }
    }

    @ApiOperation(value = "商品详情")
    @ResponseBody
    @RequestMapping(value = "/goodsdetails", method = RequestMethod.POST)
    public Object goodsDetails(@RequestBody Integer id) {
        //查询商品和商品图片
        List<GoodsToImages> goodsToImages = goodsToImagesService.queryGoodsToimage(id);
        //查询未成团的数据用于展示。
        List<GroupsToItem> groupsToItems = groupsToItemService.queryTopGroups(id);
        //商品的前几条评论
        List<GoodsEvaluate> goodsEvaluates = goodsEvaluateService.queryTopEvaluate(id);
        Map<String, Object> map = new HashMap<>();
        map.put("details", goodsToImages);
        map.put("collage", groupsToItems);
        map.put("evaluates", goodsEvaluates);
        return XuYangResult.ok(ResultConstant.code_ok, "成功", map);
    }

}
