package com.elite.App.service;

import com.elite.App.Model.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface DeptService {
    /**
     * 查询所有的部门
     */
    List<Dept> findAllDept();

    List<Dept> getDeptList();

     /**
     * 开启事务
     * @param dept
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly=true)
    void updateDept(Dept dept);

    /**
     * 开启事务，出现异常便会回滚信息
     * @param dept
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    int insertDep(Dept dept);
}
