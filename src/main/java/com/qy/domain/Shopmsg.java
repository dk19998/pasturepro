package com.qy.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/11/27.
 */
@Entity
public class Shopmsg {
    private int smid;
    private Integer smsid;
    private String smicon;
    private String smname;
    private String smunit;
    private int smnum;
    private double smprice;
    private Integer sstatus;

    @Id
    @Column(name = "smid")
    public int getSmid() {
        return smid;
    }

    public void setSmid(int smid) {
        this.smid = smid;
    }

    @Basic
    @Column(name = "smsid")
    public Integer getSmsid() {
        return smsid;
    }

    public void setSmsid(Integer smsid) {
        this.smsid = smsid;
    }

    @Basic
    @Column(name = "smicon")
    public String getSmicon() {
        return smicon;
    }

    public void setSmicon(String smicon) {
        this.smicon = smicon;
    }

    @Basic
    @Column(name = "smname")
    public String getSmname() {
        return smname;
    }

    public void setSmname(String smname) {
        this.smname = smname;
    }

    @Basic
    @Column(name = "smunit")
    public String getSmunit() {
        return smunit;
    }

    public void setSmunit(String smunit) {
        this.smunit = smunit;
    }

    @Basic
    @Column(name = "smnum")
    public int getSmnum() {
        return smnum;
    }

    public void setSmnum(int smnum) {
        this.smnum = smnum;
    }

    @Basic
    @Column(name = "smprice")
    public double getSmprice() {
        return smprice;
    }

    public void setSmprice(double smprice) {
        this.smprice = smprice;
    }

    @Basic
    @Column(name = "sstatus")
    public Integer getSstatus() {
        return sstatus;
    }

    public void setSstatus(Integer sstatus) {
        this.sstatus = sstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shopmsg shopmsg = (Shopmsg) o;

        if (smid != shopmsg.smid) return false;
        if (smnum != shopmsg.smnum) return false;
        if (Double.compare(shopmsg.smprice, smprice) != 0) return false;
        if (smsid != null ? !smsid.equals(shopmsg.smsid) : shopmsg.smsid != null) return false;
        if (smicon != null ? !smicon.equals(shopmsg.smicon) : shopmsg.smicon != null) return false;
        if (smname != null ? !smname.equals(shopmsg.smname) : shopmsg.smname != null) return false;
        if (smunit != null ? !smunit.equals(shopmsg.smunit) : shopmsg.smunit != null) return false;
        if (sstatus != null ? !sstatus.equals(shopmsg.sstatus) : shopmsg.sstatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = smid;
        result = 31 * result + (smsid != null ? smsid.hashCode() : 0);
        result = 31 * result + (smicon != null ? smicon.hashCode() : 0);
        result = 31 * result + (smname != null ? smname.hashCode() : 0);
        result = 31 * result + (smunit != null ? smunit.hashCode() : 0);
        result = 31 * result + smnum;
        temp = Double.doubleToLongBits(smprice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (sstatus != null ? sstatus.hashCode() : 0);
        return result;
    }
}
