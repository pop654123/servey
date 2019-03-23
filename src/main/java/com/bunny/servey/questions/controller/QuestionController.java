package com.bunny.servey.questions.controller;

import com.bunny.servey.questions.service.QuestionService;
import com.bunny.servey.questions.vo.QuestionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
@Slf4j
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @RequestMapping(value="getQuestionList",method = RequestMethod.GET)
    @ResponseBody
    public String getQuestionList(){
        log.info("getQuestionList in");
        String result = questionService.getQuestion();
        return result;
    }

    @RequestMapping(value="addQuestion",method = RequestMethod.POST,consumes="application/json")
    @ResponseBody
    public String addQuestion(@RequestBody QuestionVO questionVO){
        log.info("addQuestion in : " + questionVO);
        String returnData;
        if(questionVO.getName()!=null && questionVO.getQuestionType()!=0){
            questionService.saveQuestion(questionVO);
            returnData = "Add success";
        }else{
            returnData = "Add fail,缺少问题参数";
        }
        return returnData;
    }
}
