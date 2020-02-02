package com.hsbc.huatuo.service;

import com.hsbc.huatuo.bean.Survey;
import com.hsbc.huatuo.dao.SurveyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

  @Autowired
  private SurveyMapper surveyMapper;

  public Survey findByStaffId(String staffId) {
    return surveyMapper.findByStaffId(staffId);
  }

  public Survey findBySurveyId(String surveyId) {
    return surveyMapper.findBySurveyId(surveyId);
  }

  public List<Survey> findSurveyList() {
    return surveyMapper.findSurveyList();
  }

  public int add(String surveyId, String staffId, String city) {
    return surveyMapper.add(surveyId, staffId, city);
  }

}
