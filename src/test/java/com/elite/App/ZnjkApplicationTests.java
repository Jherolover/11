package com.elite.App;

import com.elite.App.Model.Dept;
import com.elite.App.mapper.DeptMapper;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@SpringBootTest
class ZnjkApplicationTests {

	@Autowired
	DeptMapper deptMapper;
	@Test
	void contextLoads() {
		List<Dept> depts = deptMapper.findAllDept();
		for ( Dept d :depts){
			System.out.println(d.toString());
		}
	}

}
