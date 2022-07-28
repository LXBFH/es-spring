package com.atguigu.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author LIXUBO
 * @Date 2022-07-28 10:40
 * @description
 * @Version 1.0
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {
}
