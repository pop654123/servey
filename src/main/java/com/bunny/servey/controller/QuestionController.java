package com.bunny.servey.controller;

import com.bunny.servey.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
@Slf4j
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @RequestMapping(value="getQuestionList",method = RequestMethod.GET)
    public String getQuestionList(){
        log.info("get method in");
        String result = questionService.getQuestion();
        return result;
    }
}
