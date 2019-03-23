package com.bunny.servey.service;

import com.bunny.servey.vo.QuestionVO;

public interface QuestionService {
    String getQuestion();
    void saveQuestion(QuestionVO questionVO);
}
