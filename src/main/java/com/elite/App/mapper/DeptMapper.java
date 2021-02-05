package com.elite.App.mapper;

import com.elite.App.Model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    /**
     * 查询所有的科室
     */
    @Select("select * from dept")
    public List<Dept> findAllDept();
}
