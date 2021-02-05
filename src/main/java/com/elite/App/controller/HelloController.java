package com.elite.App.controller;

import com.elite.App.Model.Dept;
import com.elite.App.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/h")
public class HelloController {

    //@Autowired
    //private MessageUtil messageUtil;
    @Autowired
    DeptService deptService;
    /**
     * get请求支持路径待参数
     * @param msg
     * @return
     */


    @GetMapping("/hello/{msg1}")
    public String home(@PathVariable("msg1") String msg){
        return "hello,SpringBoot!" + msg;
    }
    /**
     * 获取客户端请求的地址
     */
    @GetMapping("/obj")
    public Object getObj(HttpServletRequest request, HttpServletResponse response){
        Map<String,String> map = new HashMap<>();
        map.put("客户端IP地址",request.getRemoteHost());
        map.put("客户端响应编码",response.getCharacterEncoding());
        map.put("SeessionId",request.getSession().getId());
        return map;
    }
    @GetMapping("/view")
    public String view(String mid, Model model){
        model.addAttribute("url","www");
        model.addAttribute("mid",mid);
        return "message/message_show";
    }
    /**
     * 配置获取信息
     */
    /*@GetMapping("/getInfo")
    public String getInfo(){
        return this.messageUtil.getInfo();
    }*/
    /**
     * 获取科室列表
     */
    @GetMapping("/dept")
    public List<Dept> findAllDept(){
        return deptService.findAllDept();
    }
    /**
     * 获取科室列表
     */
    @GetMapping("/dpt")
    public List<Dept> getAllDept(){
        return deptService.getDeptList();
    }
    /**
     * 插入科室信息
     */
     @GetMapping("/saveDept")
     public List<Dept> insertDept(String deptno, String deptname){
         Dept dept = new Dept();
         dept.setDeptid(UUID.randomUUID().toString());
         dept.setDeptno(deptno);
         dept.setDeptname(deptname);
         deptService.insertDep(dept);
         return deptService.getDeptList();
     }
}
