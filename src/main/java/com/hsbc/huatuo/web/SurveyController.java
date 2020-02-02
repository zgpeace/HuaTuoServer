package com.hsbc.huatuo.web;

import com.hsbc.huatuo.bean.Survey;
import com.hsbc.huatuo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survey")
public class SurveyController {

  @Autowired
  private SurveyService surveyService;

  @GetMapping("/list")
  public List<Survey> getSurveyList() {
    return surveyService.findSurveyList();
  }

  @GetMapping("/findByStaffId")
  public Survey findByStaffId(@RequestParam(value = "staffId", required = true) String staffId) {
    return surveyService.findByStaffId(staffId);
  }

  @GetMapping("/findBySurveyId")
  public Survey findBySurveyId(@RequestParam(value = "surveyId", required = true) String surveyId) {
    return surveyService.findBySurveyId(surveyId);
  }

  @PostMapping("/add")
  public String addSurvey(@RequestParam(value = "surveyId", required = true) String surveyId,
                          @RequestParam(value = "staffId", required = true) String staffId,
                          @RequestParam(value = "city", required = true) String city) {
    int count = surveyService.add(surveyId, staffId, city);
    if (count == 1) {
      return "success";
    } else {
      return "fail";
    }
  }
}
