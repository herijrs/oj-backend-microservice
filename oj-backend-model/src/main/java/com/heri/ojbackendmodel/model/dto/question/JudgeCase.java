package com.heri.ojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 * @author heri
 * @date 2023-08-09 12:23
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;

}
