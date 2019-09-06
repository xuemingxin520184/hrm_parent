package com.xue.hrm.repository;

import com.xue.hrm.doc.EsCourse;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CourseRepository extends ElasticsearchRepository<EsCourse,Long> {
}
