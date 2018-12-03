package com.xuyang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TmoneyAuditRecord implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.money_audit_id
     *
     * @mbg.generated
     */
    private Integer moneyAuditId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.money_id
     *
     * @mbg.generated
     */
    private Integer moneyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.audit_remark
     *
     * @mbg.generated
     */
    private String auditRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.audit_status
     *
     * @mbg.generated
     */
    private Integer auditStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.put_forward
     *
     * @mbg.generated
     */
    private String putForward;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.shop_name
     *
     * @mbg.generated
     */
    private String shopName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_money_audit_record.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_money_audit_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.money_audit_id
     *
     * @return the value of t_money_audit_record.money_audit_id
     *
     * @mbg.generated
     */
    public Integer getMoneyAuditId() {
        return moneyAuditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.money_audit_id
     *
     * @param moneyAuditId the value for t_money_audit_record.money_audit_id
     *
     * @mbg.generated
     */
    public void setMoneyAuditId(Integer moneyAuditId) {
        this.moneyAuditId = moneyAuditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.money_id
     *
     * @return the value of t_money_audit_record.money_id
     *
     * @mbg.generated
     */
    public Integer getMoneyId() {
        return moneyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.money_id
     *
     * @param moneyId the value for t_money_audit_record.money_id
     *
     * @mbg.generated
     */
    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.audit_remark
     *
     * @return the value of t_money_audit_record.audit_remark
     *
     * @mbg.generated
     */
    public String getAuditRemark() {
        return auditRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.audit_remark
     *
     * @param auditRemark the value for t_money_audit_record.audit_remark
     *
     * @mbg.generated
     */
    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.audit_status
     *
     * @return the value of t_money_audit_record.audit_status
     *
     * @mbg.generated
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.audit_status
     *
     * @param auditStatus the value for t_money_audit_record.audit_status
     *
     * @mbg.generated
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.create_time
     *
     * @return the value of t_money_audit_record.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.create_time
     *
     * @param createTime the value for t_money_audit_record.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.money
     *
     * @return the value of t_money_audit_record.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.money
     *
     * @param money the value for t_money_audit_record.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.put_forward
     *
     * @return the value of t_money_audit_record.put_forward
     *
     * @mbg.generated
     */
    public String getPutForward() {
        return putForward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.put_forward
     *
     * @param putForward the value for t_money_audit_record.put_forward
     *
     * @mbg.generated
     */
    public void setPutForward(String putForward) {
        this.putForward = putForward == null ? null : putForward.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.shop_name
     *
     * @return the value of t_money_audit_record.shop_name
     *
     * @mbg.generated
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.shop_name
     *
     * @param shopName the value for t_money_audit_record.shop_name
     *
     * @mbg.generated
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_money_audit_record.user_id
     *
     * @return the value of t_money_audit_record.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_money_audit_record.user_id
     *
     * @param userId the value for t_money_audit_record.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_money_audit_record
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", moneyAuditId=").append(moneyAuditId);
        sb.append(", moneyId=").append(moneyId);
        sb.append(", auditRemark=").append(auditRemark);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", money=").append(money);
        sb.append(", putForward=").append(putForward);
        sb.append(", shopName=").append(shopName);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}