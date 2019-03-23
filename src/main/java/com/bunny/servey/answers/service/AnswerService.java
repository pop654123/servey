package com.bunny.servey.answers.service;

import com.bunny.servey.answers.vo.AnswerVO;
import java.util.List;

public interface AnswerService {
    List<AnswerVO> getAnswersByQuestionType(int questionType);
}
