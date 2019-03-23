package com.bunny.servey.answers.dao;

import com.bunny.servey.answers.vo.AnswerVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnswerDao  extends JpaRepository<AnswerVO, Long> {
    @Modifying
    @Query(value="select o from AnswerVO o where o.questionType= ?1")
    List<AnswerVO> findByQuestionType(int  QuestionType);
}
