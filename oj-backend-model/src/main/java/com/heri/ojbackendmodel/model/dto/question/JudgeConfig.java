package com.heri.ojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 * @author heri
 * @date 2023-08-09 12:23
 */
@Data
public class JudgeConfig {
    /**
     * 时间限制(ms)
     */
    private long timeLimit;

    /**
     * 空间限制(kb)
     */
    private long memoryLimit;

    /**
     * 堆栈限制(kb)
     */
    private long stackLimit;

}
