package com.bunny.servey.questions.service;

import com.bunny.servey.questions.vo.QuestionVO;

public interface QuestionService {
    String getQuestion();
    void saveQuestion(QuestionVO questionVO);
}
