package com.elite.App.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept {

    @Id
    private String deptid;

    private String deptno;

    private String deptname;

    private String deptscript;

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptscript() {
        return deptscript;
    }

    public void setDeptscript(String deptscript) {
        this.deptscript = deptscript;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno='" + deptno + '\'' +
                ", deptname='" + deptname + '\'' +
                ", deptscript='" + deptscript + '\'' +
                '}';
    }
}
