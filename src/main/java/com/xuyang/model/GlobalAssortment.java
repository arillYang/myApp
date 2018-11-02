package com.xuyang.model;

import java.io.Serializable;

public class GlobalAssortment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column global_assortment.global_id
     *
     * @mbg.generated
     */
    private Integer globalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column global_assortment.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column global_assortment.global_name
     *
     * @mbg.generated
     */
    private String globalName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column global_assortment.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table global_assortment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column global_assortment.global_id
     *
     * @return the value of global_assortment.global_id
     *
     * @mbg.generated
     */
    public Integer getGlobalId() {
        return globalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column global_assortment.global_id
     *
     * @param globalId the value for global_assortment.global_id
     *
     * @mbg.generated
     */
    public void setGlobalId(Integer globalId) {
        this.globalId = globalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column global_assortment.user_id
     *
     * @return the value of global_assortment.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column global_assortment.user_id
     *
     * @param userId the value for global_assortment.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column global_assortment.global_name
     *
     * @return the value of global_assortment.global_name
     *
     * @mbg.generated
     */
    public String getGlobalName() {
        return globalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column global_assortment.global_name
     *
     * @param globalName the value for global_assortment.global_name
     *
     * @mbg.generated
     */
    public void setGlobalName(String globalName) {
        this.globalName = globalName == null ? null : globalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column global_assortment.status
     *
     * @return the value of global_assortment.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column global_assortment.status
     *
     * @param status the value for global_assortment.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_assortment
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", globalId=").append(globalId);
        sb.append(", userId=").append(userId);
        sb.append(", globalName=").append(globalName);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}