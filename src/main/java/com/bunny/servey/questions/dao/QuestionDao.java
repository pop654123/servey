package com.bunny.servey.questions.dao;

import com.bunny.servey.questions.vo.QuestionVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<QuestionVO, Long> {
    @Override
    List<QuestionVO> findAll();
}
