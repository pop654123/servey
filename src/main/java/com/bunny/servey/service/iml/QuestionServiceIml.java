package com.bunny.servey.service.iml;

import com.bunny.servey.dao.QuestionDao;
import com.bunny.servey.service.QuestionService;
import com.bunny.servey.vo.QuestionVO;
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
        log.info("wm_debug:getQuestion in");
        List<QuestionVO> QuestionList= new ArrayList<>();
        QuestionList = questionDao.findAll();
        log.info("QuestionList size = "+QuestionList.size());
        log.info("QuestionList :"+QuestionList.toString());
        return QuestionList.toString();
    }
}
