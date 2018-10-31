/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ThomepageController
 * Author:   Administrator
 * Date:     2018/10/31 14:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyang.controller;

import com.xuyang.model.Tadvertising;
import com.xuyang.model.Tgoods;
import com.xuyang.service.TadverService;
import com.xuyang.service.TgoodsService;
import com.xuyang.util.JsonUtils;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈首页功能控制器〉
 * @author Administrator
 * @create 2018/10/31
 * @since 1.0.0
 */
@Api(description = "首页接口")
@Controller
@RequestMapping(value = "/home")
public class ThomepageController {

    @Autowired
    private TadverService tadverService;
    @Autowired
    private TgoodsService tgoodsService;
    /**
     * 功能描述: <br>
     * 〈轮播图查询〉
     * @return:
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    @ApiOperation(value = "查询轮播图")
    @ResponseBody
    @GetMapping("/queryBroadcast")
    public Object queryBroadcast(){
        List<Tadvertising> tadvertisings = tadverService.queryBroadcast();
        if(tadvertisings == null){
            return XuYangResult.ok(ResultConstant.code_failue, "没有获取到数据", null);
        }else{
            Jedis redis = new Jedis();
            redis.set("queryBroadcast", JsonUtils.objectToJson(tadvertisings));
            redis.expire("queryBroadcast",100);
            return XuYangResult.ok(ResultConstant.code_ok, "成功", tadvertisings);
        }
    }
    @ApiOperation(value = "新品推荐")
    @ResponseBody
    @RequestMapping(value = "/newArrivals",method = RequestMethod.GET)
    public Object newgoos(){
        List<Tgoods> tgoods = tgoodsService.queryNewGoods();
        if(tgoods == null){
            return XuYangResult.ok(500,"没有数据",null);
        }else{
            return XuYangResult.ok(200,"成功",tgoods);
        }
    }

    @ApiOperation(value = "精品商品")
    @ResponseBody
    @RequestMapping(value = "/bestArrivals",method = RequestMethod.GET)
    public Object queryBestGoos(){
        List<Tgoods> tgoods = tgoodsService.queryNewGoods();
        if(tgoods == null){
            return XuYangResult.ok(500,"没有数据",null);
        }else{
            return XuYangResult.ok(200,"成功",tgoods);
        }
    }

}
