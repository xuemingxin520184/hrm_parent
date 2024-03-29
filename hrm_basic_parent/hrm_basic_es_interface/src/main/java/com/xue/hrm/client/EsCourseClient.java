package com.xue.hrm.client;

import com.xue.hrm.doc.EsCourse;
import com.xue.hrm.query.EsCourseQuery;
import com.xue.hrm.util.AjaxResult;
import com.xue.hrm.util.PageList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "HRM-ES", configuration = FeignClientsConfiguration.class,
        fallbackFactory = EsCourseClientHystrixFallbackFactory.class)
@RequestMapping("/esCourse")
public interface EsCourseClient {
    /**
     * 保存和修改公用的
     *
     * @param esCourse 传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    AjaxResult save(EsCourse esCourse);

    /**
     * 删除对象信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    AjaxResult delete(@PathVariable("id") Integer id);

    //获取用户
    @RequestMapping("/{id}")
    EsCourse get(@RequestParam(value = "id", required = true) Long id);


    /**
     * 查看所有的员工信息
     *
     * @return
     */
    @RequestMapping("/list")
    public List<EsCourse> list();

    /**
     * 分页查询数据
     *
     * @param query 查询对象
     * @return PageList 分页对象
     */
    @RequestMapping(value = "/json", method = RequestMethod.POST)
    PageList<EsCourse> json(@RequestBody EsCourseQuery query);

    @PostMapping("/online")
    AjaxResult batchSave(List<EsCourse> esCourseList);

    @PostMapping("/offline")
    void batchDel(List<EsCourse> esCourseList);
}
