package com.louis.interViewJi.esdao;

/**
 * @author louis
 * @version 1.0
 * @date 2024/10/27 13:30
 */

import com.louis.interViewJi.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 题目 ES 操作
 */
public interface QuestionEsDao
        extends ElasticsearchRepository<QuestionEsDTO, Long> {
    /**
     * 根据用户 id 查询
     * @param userId
     * @return
     */
    List<QuestionEsDTO> findByUserId(Long userId);

}
