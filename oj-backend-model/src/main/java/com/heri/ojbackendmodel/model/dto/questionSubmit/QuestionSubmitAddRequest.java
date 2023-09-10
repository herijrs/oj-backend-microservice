package com.heri.ojbackendmodel.model.dto.questionSubmit;

import lombok.Data;

import java.io.Serializable;


/**
 * 创建请求
 *
 * @author heri
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;


    /**
     * 题目id
     */
    private Long questionId;


    private static final long serialVersionUID = 1L;
}