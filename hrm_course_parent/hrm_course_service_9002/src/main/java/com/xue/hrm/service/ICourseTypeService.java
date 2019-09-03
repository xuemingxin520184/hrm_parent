package com.xue.hrm.service;

import com.xue.hrm.domain.CourseType;
import com.baomidou.mybatisplus.service.IService;
import com.xue.hrm.query.CourseTypeQuery;
import com.xue.hrm.util.PageList;

/**
 * <p>
 * 课程目录 服务类
 * </p>
 *
 * @author yhptest
 * @since 2019-09-01
 */
public interface ICourseTypeService extends IService<CourseType> {

    /**
     * 高级查询+分页+关联查询
     * @param query
     * @return
     */
    PageList<CourseType> selectListPage(CourseTypeQuery query);
}
