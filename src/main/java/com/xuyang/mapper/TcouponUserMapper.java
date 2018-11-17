package com.xuyang.mapper;

import com.xuyang.model.TcouponUser;
import com.xuyang.model.TcouponUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcouponUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    long countByExample(TcouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int deleteByExample(TcouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int insert(TcouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int insertSelective(TcouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    List<TcouponUser> selectByExample(TcouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    TcouponUser selectByPrimaryKey(Integer cuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TcouponUser record, @Param("example") TcouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TcouponUser record, @Param("example") TcouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TcouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TcouponUser record);
}