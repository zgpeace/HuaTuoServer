package com.hsbc.huatuo.dao;

import com.hsbc.huatuo.bean.Survey;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SurveyMapper {

//  CREATE TABLE survey (
//      id INT PRIMARY KEY auto_increment,
//      staff_id varchar(20),
//  survey_id varchar(20),
//  city varchar(20)
//);

  @Select("select id, staff_id, survey_id, city from survey where staff_id = #{staffId}")
  Survey findByStaffId(String staffId);

  @Select("select id, staff_id, survey_id, city from survey where survey_id = #{surveyId}")
  Survey findBySurveyId(String surveyId);

  @Select("select id, staff_id, survey_id, city from survey")
  List<Survey> findSurveyList();

  @Insert("insert into survey(staff_id, survey_id, city) values(#{staffId}, #{surveyId}, #{city})")
  int add(@Param("staffId") String surveyId, @Param("surveyId") String staffId, @Param("city") String city);


}
