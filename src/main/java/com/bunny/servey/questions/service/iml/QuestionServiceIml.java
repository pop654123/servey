package com.bunny.servey.questions.service.iml;

import com.bunny.servey.questions.dao.QuestionDao;
import com.bunny.servey.questions.service.QuestionService;
import com.bunny.servey.questions.vo.QuestionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class QuestionServiceIml implements QuestionService {
    @Autowired
    QuestionDao questionDao;
    @Override
    public String getQuestion() {
        List<QuestionVO> QuestionList= new ArrayList<>();
        QuestionList = questionDao.findAll();
        log.info("QuestionList :"+QuestionList.toString());
        return QuestionList.toString();
    }

    @Override
    public void saveQuestion(QuestionVO questionVO) {
        questionDao.save(questionVO);
    }

}
