package com.xuyang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TlifeAide implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_life_aide.life_id
     *
     * @mbg.generated
     */
    private Integer lifeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_life_aide.third_party_state
     *
     * @mbg.generated
     */
    private String thirdPartyState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_life_aide.life_money
     *
     * @mbg.generated
     */
    private BigDecimal lifeMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_life_aide.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_life_aide.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_life_aide.third_name
     *
     * @mbg.generated
     */
    private String thirdName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_life_aide
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_life_aide.life_id
     *
     * @return the value of t_life_aide.life_id
     *
     * @mbg.generated
     */
    public Integer getLifeId() {
        return lifeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_life_aide.life_id
     *
     * @param lifeId the value for t_life_aide.life_id
     *
     * @mbg.generated
     */
    public void setLifeId(Integer lifeId) {
        this.lifeId = lifeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_life_aide.third_party_state
     *
     * @return the value of t_life_aide.third_party_state
     *
     * @mbg.generated
     */
    public String getThirdPartyState() {
        return thirdPartyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_life_aide.third_party_state
     *
     * @param thirdPartyState the value for t_life_aide.third_party_state
     *
     * @mbg.generated
     */
    public void setThirdPartyState(String thirdPartyState) {
        this.thirdPartyState = thirdPartyState == null ? null : thirdPartyState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_life_aide.life_money
     *
     * @return the value of t_life_aide.life_money
     *
     * @mbg.generated
     */
    public BigDecimal getLifeMoney() {
        return lifeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_life_aide.life_money
     *
     * @param lifeMoney the value for t_life_aide.life_money
     *
     * @mbg.generated
     */
    public void setLifeMoney(BigDecimal lifeMoney) {
        this.lifeMoney = lifeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_life_aide.user_id
     *
     * @return the value of t_life_aide.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_life_aide.user_id
     *
     * @param userId the value for t_life_aide.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_life_aide.create_time
     *
     * @return the value of t_life_aide.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_life_aide.create_time
     *
     * @param createTime the value for t_life_aide.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_life_aide.third_name
     *
     * @return the value of t_life_aide.third_name
     *
     * @mbg.generated
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_life_aide.third_name
     *
     * @param thirdName the value for t_life_aide.third_name
     *
     * @mbg.generated
     */
    public void setThirdName(String thirdName) {
        this.thirdName = thirdName == null ? null : thirdName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_life_aide
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lifeId=").append(lifeId);
        sb.append(", thirdPartyState=").append(thirdPartyState);
        sb.append(", lifeMoney=").append(lifeMoney);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", thirdName=").append(thirdName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}