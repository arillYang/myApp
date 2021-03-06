package com.xuyang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Tmoney implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.money_id
     *
     * @mbg.generated
     */
    private Integer moneyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.target_type
     *
     * @mbg.generated
     */
    private String targetType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.data_src
     *
     * @mbg.generated
     */
    private String dataSrc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.money_type
     *
     * @mbg.generated
     */
    private String moneyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.money_remark
     *
     * @mbg.generated
     */
    private String moneyRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.pay_type
     *
     * @mbg.generated
     */
    private String payType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.data_falg
     *
     * @mbg.generated
     */
    private String dataFalg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.put_forward
     *
     * @mbg.generated
     */
    private String putForward;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money.forward
     *
     * @mbg.generated
     */
    private Date forward;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_money
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.money_id
     *
     * @return the value of t_money.money_id
     *
     * @mbg.generated
     */
    public Integer getMoneyId() {
        return moneyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.money_id
     *
     * @param moneyId the value for t_money.money_id
     *
     * @mbg.generated
     */
    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.target_type
     *
     * @return the value of t_money.target_type
     *
     * @mbg.generated
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.target_type
     *
     * @param targetType the value for t_money.target_type
     *
     * @mbg.generated
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType == null ? null : targetType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.data_src
     *
     * @return the value of t_money.data_src
     *
     * @mbg.generated
     */
    public String getDataSrc() {
        return dataSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.data_src
     *
     * @param dataSrc the value for t_money.data_src
     *
     * @mbg.generated
     */
    public void setDataSrc(String dataSrc) {
        this.dataSrc = dataSrc == null ? null : dataSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.money_type
     *
     * @return the value of t_money.money_type
     *
     * @mbg.generated
     */
    public String getMoneyType() {
        return moneyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.money_type
     *
     * @param moneyType the value for t_money.money_type
     *
     * @mbg.generated
     */
    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType == null ? null : moneyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.money_remark
     *
     * @return the value of t_money.money_remark
     *
     * @mbg.generated
     */
    public String getMoneyRemark() {
        return moneyRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.money_remark
     *
     * @param moneyRemark the value for t_money.money_remark
     *
     * @mbg.generated
     */
    public void setMoneyRemark(String moneyRemark) {
        this.moneyRemark = moneyRemark == null ? null : moneyRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.create_time
     *
     * @return the value of t_money.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.create_time
     *
     * @param createTime the value for t_money.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.money
     *
     * @return the value of t_money.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.money
     *
     * @param money the value for t_money.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.pay_type
     *
     * @return the value of t_money.pay_type
     *
     * @mbg.generated
     */
    public String getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.pay_type
     *
     * @param payType the value for t_money.pay_type
     *
     * @mbg.generated
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.data_falg
     *
     * @return the value of t_money.data_falg
     *
     * @mbg.generated
     */
    public String getDataFalg() {
        return dataFalg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.data_falg
     *
     * @param dataFalg the value for t_money.data_falg
     *
     * @mbg.generated
     */
    public void setDataFalg(String dataFalg) {
        this.dataFalg = dataFalg == null ? null : dataFalg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.user_id
     *
     * @return the value of t_money.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.user_id
     *
     * @param userId the value for t_money.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.put_forward
     *
     * @return the value of t_money.put_forward
     *
     * @mbg.generated
     */
    public String getPutForward() {
        return putForward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.put_forward
     *
     * @param putForward the value for t_money.put_forward
     *
     * @mbg.generated
     */
    public void setPutForward(String putForward) {
        this.putForward = putForward == null ? null : putForward.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money.forward
     *
     * @return the value of t_money.forward
     *
     * @mbg.generated
     */
    public Date getForward() {
        return forward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money.forward
     *
     * @param forward the value for t_money.forward
     *
     * @mbg.generated
     */
    public void setForward(Date forward) {
        this.forward = forward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", moneyId=").append(moneyId);
        sb.append(", targetType=").append(targetType);
        sb.append(", dataSrc=").append(dataSrc);
        sb.append(", moneyType=").append(moneyType);
        sb.append(", moneyRemark=").append(moneyRemark);
        sb.append(", createTime=").append(createTime);
        sb.append(", money=").append(money);
        sb.append(", payType=").append(payType);
        sb.append(", dataFalg=").append(dataFalg);
        sb.append(", userId=").append(userId);
        sb.append(", putForward=").append(putForward);
        sb.append(", forward=").append(forward);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}