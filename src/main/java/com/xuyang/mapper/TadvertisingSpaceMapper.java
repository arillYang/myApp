package com.xuyang.mapper;

import com.xuyang.model.TadvertisingSpace;
import com.xuyang.model.TadvertisingSpaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TadvertisingSpaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    long countByExample(TadvertisingSpaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int deleteByExample(TadvertisingSpaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer spaceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int insert(TadvertisingSpace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int insertSelective(TadvertisingSpace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    List<TadvertisingSpace> selectByExample(TadvertisingSpaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    TadvertisingSpace selectByPrimaryKey(Integer spaceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TadvertisingSpace record, @Param("example") TadvertisingSpaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TadvertisingSpace record, @Param("example") TadvertisingSpaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TadvertisingSpace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advertising_space
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TadvertisingSpace record);
}