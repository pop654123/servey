package com.bunny.servey.answers.controller;

import com.bunny.servey.answers.service.AnswerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer")
@Slf4j
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @RequestMapping(value="getAnswer",method = RequestMethod.GET)
    @ResponseBody
    public String getAnswer(@RequestParam(name="questionType",required=true) int questionType){
        log.info("getQuestionList in");
        String result = answerService.getAnswersByQuestionType(questionType).toString();
        return result;
    }
}
