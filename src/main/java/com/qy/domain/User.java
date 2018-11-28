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
public class User {
    private int uid;
    private String username;
    private String password;
    private String uicon;
    private String utel;
    private String utime;
    private Integer ustatus;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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
    @Column(name = "uicon")
    public String getUicon() {
        return uicon;
    }

    public void setUicon(String uicon) {
        this.uicon = uicon;
    }

    @Basic
    @Column(name = "utel")
    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    @Basic
    @Column(name = "utime")
    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }

    @Basic
    @Column(name = "ustatus")
    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (uid != user.uid) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (uicon != null ? !uicon.equals(user.uicon) : user.uicon != null) return false;
        if (utel != null ? !utel.equals(user.utel) : user.utel != null) return false;
        if (utime != null ? !utime.equals(user.utime) : user.utime != null) return false;
        if (ustatus != null ? !ustatus.equals(user.ustatus) : user.ustatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (uicon != null ? uicon.hashCode() : 0);
        result = 31 * result + (utel != null ? utel.hashCode() : 0);
        result = 31 * result + (utime != null ? utime.hashCode() : 0);
        result = 31 * result + (ustatus != null ? ustatus.hashCode() : 0);
        return result;
    }
}
