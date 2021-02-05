package com.elite.App.service.impl;

import com.elite.App.Model.Dept;
import com.elite.App.dao.DeptDAO;
import com.elite.App.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    //@Autowired
    //DeptMapper deptMapper;

    @Autowired
    DeptDAO deptDAO;

    @Override
    public List<Dept> findAllDept() {
        //return deptMapper.findAllDept();
        return null;
    }

    @Override
    public List<Dept> getDeptList() {
        deptDAO.findAll();
        return deptDAO.findAll();
    }

    @Override
    public void updateDept(Dept dept) {

    }

    /**
     * 插入部门
     * @param dept
     * @return
     */
    @Override
    public int insertDep(Dept dept) {
        deptDAO.save(dept);
        int i = 2/0;
        return 0;
    }
}
