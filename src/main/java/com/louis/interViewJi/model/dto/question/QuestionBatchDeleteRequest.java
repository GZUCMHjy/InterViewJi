package com.louis.interViewJi.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author louis
 * @version 1.0
 * @date 2024/10/27 21:19
 */
@Data
public class QuestionBatchDeleteRequest implements Serializable {

    /**
     * 题目 id 列表
     */
    private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}