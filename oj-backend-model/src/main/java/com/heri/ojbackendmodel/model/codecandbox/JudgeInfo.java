package com.heri.ojbackendmodel.model.codecandbox;

import lombok.Data;

/**
 * 题目配置
 * @author heri
 * @date 2023-08-09 12:23
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private long memory;

    /**
     * 消耗时间
     */
    private long time;

}
