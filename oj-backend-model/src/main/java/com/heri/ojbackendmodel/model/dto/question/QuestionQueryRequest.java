package com.heri.ojbackendmodel.model.dto.question;


import com.heri.ojbackendcommon.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;
/**
 * 查询请求
 *
 * @author heri   
 * @from 
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 题目标签
     */
    private List<String> tags;

    /**
     * 题目答案
     */
    private String answer;


    /**
     * 创建用户id
     */
    private Long userId;


    private static final long serialVersionUID = 1L;
}