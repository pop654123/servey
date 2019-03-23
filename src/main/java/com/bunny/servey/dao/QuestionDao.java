package com.bunny.servey.dao;

import com.bunny.servey.vo.QuestionVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<QuestionVO, Long> {
    @Override
    List<QuestionVO> findAll();
}
