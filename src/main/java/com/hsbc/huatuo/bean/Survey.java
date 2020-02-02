package com.hsbc.huatuo.bean;

import java.io.Serializable;

public class Survey implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private String staffid;
  private String surveyid;
  private String city;

  public Long getId() {
    return id;
  }

  public String getStaffId() {
    return staffid;
  }

  public String getSurveyId() {
    return surveyid;
  }

  public String getCity() {
    return city;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setStaffId(String staffId) {
    this.staffid = staffId;
  }

  public void setSurveyId(String surveyId) {
    this.surveyid = surveyId;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
