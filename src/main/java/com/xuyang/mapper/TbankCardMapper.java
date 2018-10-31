package com.xuyang.mapper;

import com.xuyang.model.TbankCard;
import com.xuyang.model.TbankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbankCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    long countByExample(TbankCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int deleteByExample(TbankCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer bankCardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int insert(TbankCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int insertSelective(TbankCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    List<TbankCard> selectByExample(TbankCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    TbankCard selectByPrimaryKey(Integer bankCardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbankCard record, @Param("example") TbankCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbankCard record, @Param("example") TbankCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbankCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbankCard record);
}