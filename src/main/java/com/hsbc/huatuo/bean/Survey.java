package com.hsbc.huatuo.bean;

import java.io.Serializable;

public class Survey implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private String staffId;
  private String surveyId;
  private String city;

  public Long getId() {
    return id;
  }

  public String getStaffId() {
    return staffId;
  }

  public String getSurveyId() {
    return surveyId;
  }

  public String getCity() {
    return city;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public void setSurveyId(String surveyId) {
    this.surveyId = surveyId;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
