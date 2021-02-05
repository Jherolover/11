package com.elite.App.dao;

import com.elite.App.Model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 查询科室的后台
 */
@Repository
public interface DeptDAO  extends JpaRepository<Dept,String> {


}
