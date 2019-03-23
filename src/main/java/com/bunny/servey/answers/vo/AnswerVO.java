package com.bunny.servey.answers.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="answer")
@Setter
@Getter
public class AnswerVO  implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;
    @Column(name="question_type")
    private int questionType;
    @Column(name="answer")
    private String answer;

    @Override
    public String toString() {
        JSONObject answerVO = new JSONObject(true);
        answerVO.put("id",id);
        answerVO.put("questionType",questionType);
        answerVO.put("answer",answer);
        return answerVO.toJSONString();
    }
}
