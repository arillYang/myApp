package com.xuyang.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Taccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.account_id
     *
     * @mbg.generated
     */
    private Integer accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.account_balance
     *
     * @mbg.generated
     */
    private BigDecimal accountBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_account
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.account_id
     *
     * @return the value of t_account.account_id
     *
     * @mbg.generated
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.account_id
     *
     * @param accountId the value for t_account.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.user_id
     *
     * @return the value of t_account.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.user_id
     *
     * @param userId the value for t_account.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.account_balance
     *
     * @return the value of t_account.account_balance
     *
     * @mbg.generated
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.account_balance
     *
     * @param accountBalance the value for t_account.account_balance
     *
     * @mbg.generated
     */
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountId=").append(accountId);
        sb.append(", userId=").append(userId);
        sb.append(", accountBalance=").append(accountBalance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}