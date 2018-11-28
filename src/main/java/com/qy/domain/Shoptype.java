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
public class Shoptype {
    private int sid;
    private int sortnum;
    private String sname;
    private String stime;

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sortnum")
    public int getSortnum() {
        return sortnum;
    }

    public void setSortnum(int sortnum) {
        this.sortnum = sortnum;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "stime")
    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shoptype shoptype = (Shoptype) o;

        if (sid != shoptype.sid) return false;
        if (sortnum != shoptype.sortnum) return false;
        if (sname != null ? !sname.equals(shoptype.sname) : shoptype.sname != null) return false;
        if (stime != null ? !stime.equals(shoptype.stime) : shoptype.stime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + sortnum;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (stime != null ? stime.hashCode() : 0);
        return result;
    }
}
