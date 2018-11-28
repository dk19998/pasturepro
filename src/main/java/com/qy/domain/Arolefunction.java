package com.qy.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/11/27.
 */
@Entity
public class Arolefunction {
    private int afid;
    private String aficon;
    private String afuser;
    private String afshop;
    private String aforder;
    private String aftype;

    @Id
    @Column(name = "afid")
    public int getAfid() {
        return afid;
    }

    public void setAfid(int afid) {
        this.afid = afid;
    }

    @Basic
    @Column(name = "aficon")
    public String getAficon() {
        return aficon;
    }

    public void setAficon(String aficon) {
        this.aficon = aficon;
    }

    @Basic
    @Column(name = "afuser")
    public String getAfuser() {
        return afuser;
    }

    public void setAfuser(String afuser) {
        this.afuser = afuser;
    }

    @Basic
    @Column(name = "afshop")
    public String getAfshop() {
        return afshop;
    }

    public void setAfshop(String afshop) {
        this.afshop = afshop;
    }

    @Basic
    @Column(name = "aforder")
    public String getAforder() {
        return aforder;
    }

    public void setAforder(String aforder) {
        this.aforder = aforder;
    }

    @Basic
    @Column(name = "aftype")
    public String getAftype() {
        return aftype;
    }

    public void setAftype(String aftype) {
        this.aftype = aftype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arolefunction that = (Arolefunction) o;

        if (afid != that.afid) return false;
        if (aficon != null ? !aficon.equals(that.aficon) : that.aficon != null) return false;
        if (afuser != null ? !afuser.equals(that.afuser) : that.afuser != null) return false;
        if (afshop != null ? !afshop.equals(that.afshop) : that.afshop != null) return false;
        if (aforder != null ? !aforder.equals(that.aforder) : that.aforder != null) return false;
        if (aftype != null ? !aftype.equals(that.aftype) : that.aftype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = afid;
        result = 31 * result + (aficon != null ? aficon.hashCode() : 0);
        result = 31 * result + (afuser != null ? afuser.hashCode() : 0);
        result = 31 * result + (afshop != null ? afshop.hashCode() : 0);
        result = 31 * result + (aforder != null ? aforder.hashCode() : 0);
        result = 31 * result + (aftype != null ? aftype.hashCode() : 0);
        return result;
    }
}
