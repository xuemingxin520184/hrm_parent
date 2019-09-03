package com.xue.hrm.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.xue.hrm.domain.CourseType;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xue.hrm.query.CourseTypeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 课程目录 Mapper 接口
 * </p>
 *
 * @author yhptest
 * @since 2019-09-01
 */
public interface CourseTypeMapper extends BaseMapper<CourseType> {

    List<CourseType> loadListPage(Pagination page,
                                  @Param("query") CourseTypeQuery query);
}
