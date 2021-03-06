package com.xuyang.model;

import java.io.Serializable;
import java.util.Date;

public class Thouse implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house.house_id
     *
     * @mbg.generated
     */
    private Integer houseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house.house_time
     *
     * @mbg.generated
     */
    private Date houseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house.g_id
     *
     * @mbg.generated
     */
    private Integer gId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house.dy_id
     *
     * @mbg.generated
     */
    private Integer dyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house.g_name
     *
     * @mbg.generated
     */
    private String gName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house.dy_title
     *
     * @mbg.generated
     */
    private String dyTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_house.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_house
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house.house_id
     *
     * @return the value of t_house.house_id
     *
     * @mbg.generated
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house.house_id
     *
     * @param houseId the value for t_house.house_id
     *
     * @mbg.generated
     */
    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house.house_time
     *
     * @return the value of t_house.house_time
     *
     * @mbg.generated
     */
    public Date getHouseTime() {
        return houseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house.house_time
     *
     * @param houseTime the value for t_house.house_time
     *
     * @mbg.generated
     */
    public void setHouseTime(Date houseTime) {
        this.houseTime = houseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house.g_id
     *
     * @return the value of t_house.g_id
     *
     * @mbg.generated
     */
    public Integer getgId() {
        return gId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house.g_id
     *
     * @param gId the value for t_house.g_id
     *
     * @mbg.generated
     */
    public void setgId(Integer gId) {
        this.gId = gId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house.dy_id
     *
     * @return the value of t_house.dy_id
     *
     * @mbg.generated
     */
    public Integer getDyId() {
        return dyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house.dy_id
     *
     * @param dyId the value for t_house.dy_id
     *
     * @mbg.generated
     */
    public void setDyId(Integer dyId) {
        this.dyId = dyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house.g_name
     *
     * @return the value of t_house.g_name
     *
     * @mbg.generated
     */
    public String getgName() {
        return gName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house.g_name
     *
     * @param gName the value for t_house.g_name
     *
     * @mbg.generated
     */
    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house.dy_title
     *
     * @return the value of t_house.dy_title
     *
     * @mbg.generated
     */
    public String getDyTitle() {
        return dyTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house.dy_title
     *
     * @param dyTitle the value for t_house.dy_title
     *
     * @mbg.generated
     */
    public void setDyTitle(String dyTitle) {
        this.dyTitle = dyTitle == null ? null : dyTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_house.user_id
     *
     * @return the value of t_house.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_house.user_id
     *
     * @param userId the value for t_house.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_house
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", houseId=").append(houseId);
        sb.append(", houseTime=").append(houseTime);
        sb.append(", gId=").append(gId);
        sb.append(", dyId=").append(dyId);
        sb.append(", gName=").append(gName);
        sb.append(", dyTitle=").append(dyTitle);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}