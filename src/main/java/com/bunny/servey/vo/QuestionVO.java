package com.bunny.servey.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="question")
@Setter
@Getter
public class QuestionVO implements Serializable {
    @Id
    @Column(name="question_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String questionId;
    @Column(name="question_type")
    private int questionType;
    @Column(name="name")
    private String name;
    @Column(name="category")
    private String category;

    @Override
    public String toString() {
        JSONObject questionVO = new JSONObject(true);
        questionVO.put("questionId",questionId);
        questionVO.put("questionType",questionType);
        questionVO.put("name",name);
        questionVO.put("category",category);
        return questionVO.toJSONString();
    }
}
