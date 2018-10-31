package com.xuyang.model;

import java.io.Serializable;
import java.util.Date;

public class TouponUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_user.cu_id
     *
     * @mbg.generated
     */
    private Integer cuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_user.coupon_id
     *
     * @mbg.generated
     */
    private Integer couponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_user.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_user.receive_time
     *
     * @mbg.generated
     */
    private Date receiveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_user.coupon_status
     *
     * @mbg.generated
     */
    private String couponStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_coupon_user.data_falg
     *
     * @mbg.generated
     */
    private String dataFalg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_user.cu_id
     *
     * @return the value of t_coupon_user.cu_id
     *
     * @mbg.generated
     */
    public Integer getCuId() {
        return cuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_user.cu_id
     *
     * @param cuId the value for t_coupon_user.cu_id
     *
     * @mbg.generated
     */
    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_user.coupon_id
     *
     * @return the value of t_coupon_user.coupon_id
     *
     * @mbg.generated
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_user.coupon_id
     *
     * @param couponId the value for t_coupon_user.coupon_id
     *
     * @mbg.generated
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_user.user_id
     *
     * @return the value of t_coupon_user.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_user.user_id
     *
     * @param userId the value for t_coupon_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_user.receive_time
     *
     * @return the value of t_coupon_user.receive_time
     *
     * @mbg.generated
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_user.receive_time
     *
     * @param receiveTime the value for t_coupon_user.receive_time
     *
     * @mbg.generated
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_user.coupon_status
     *
     * @return the value of t_coupon_user.coupon_status
     *
     * @mbg.generated
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_user.coupon_status
     *
     * @param couponStatus the value for t_coupon_user.coupon_status
     *
     * @mbg.generated
     */
    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus == null ? null : couponStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_coupon_user.data_falg
     *
     * @return the value of t_coupon_user.data_falg
     *
     * @mbg.generated
     */
    public String getDataFalg() {
        return dataFalg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_coupon_user.data_falg
     *
     * @param dataFalg the value for t_coupon_user.data_falg
     *
     * @mbg.generated
     */
    public void setDataFalg(String dataFalg) {
        this.dataFalg = dataFalg == null ? null : dataFalg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupon_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cuId=").append(cuId);
        sb.append(", couponId=").append(couponId);
        sb.append(", userId=").append(userId);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", dataFalg=").append(dataFalg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}