package com.bunny.servey.answers.service.iml;

import com.bunny.servey.answers.dao.AnswerDao;
import com.bunny.servey.answers.service.AnswerService;
import com.bunny.servey.answers.vo.AnswerVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class AnswerServiceIml implements AnswerService {
    @Autowired
    AnswerDao answerDao;
    @Override
    public List<AnswerVO> getAnswersByQuestionType(int questionType) {
        List<AnswerVO> answerVOList = new ArrayList<>();
        answerVOList = answerDao.findByQuestionType(questionType);
        log.info("AnswerService:getAnswersByQuestionType, answerVOList =" + answerVOList.toString());
        return answerVOList;
    }
}
