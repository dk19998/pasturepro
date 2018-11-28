package com.qy.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/11/27.
 */
@Entity
public class Admin {
    private int aid;
    private String username;
    private String password;
    private String aname;
    private Integer aroleid;
    private String register;
    private Integer astatus;

    @Id
    @Column(name = "aid")
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "aname")
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Basic
    @Column(name = "aroleid")
    public Integer getAroleid() {
        return aroleid;
    }

    public void setAroleid(Integer aroleid) {
        this.aroleid = aroleid;
    }

    @Basic
    @Column(name = "register")
    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    @Basic
    @Column(name = "astatus")
    public Integer getAstatus() {
        return astatus;
    }

    public void setAstatus(Integer astatus) {
        this.astatus = astatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (aid != admin.aid) return false;
        if (username != null ? !username.equals(admin.username) : admin.username != null) return false;
        if (password != null ? !password.equals(admin.password) : admin.password != null) return false;
        if (aname != null ? !aname.equals(admin.aname) : admin.aname != null) return false;
        if (aroleid != null ? !aroleid.equals(admin.aroleid) : admin.aroleid != null) return false;
        if (register != null ? !register.equals(admin.register) : admin.register != null) return false;
        if (astatus != null ? !astatus.equals(admin.astatus) : admin.astatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (aname != null ? aname.hashCode() : 0);
        result = 31 * result + (aroleid != null ? aroleid.hashCode() : 0);
        result = 31 * result + (register != null ? register.hashCode() : 0);
        result = 31 * result + (astatus != null ? astatus.hashCode() : 0);
        return result;
    }
}
