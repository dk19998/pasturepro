package com.qy.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/11/27.
 */
@Entity
public class Orderdetails {
    private int detid;
    private Integer ordersmid;
    private Integer osnum;

    @Id
    @Column(name = "detid")
    public int getDetid() {
        return detid;
    }

    public void setDetid(int detid) {
        this.detid = detid;
    }

    @Basic
    @Column(name = "ordersmid")
    public Integer getOrdersmid() {
        return ordersmid;
    }

    public void setOrdersmid(Integer ordersmid) {
        this.ordersmid = ordersmid;
    }

    @Basic
    @Column(name = "osnum")
    public Integer getOsnum() {
        return osnum;
    }

    public void setOsnum(Integer osnum) {
        this.osnum = osnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderdetails that = (Orderdetails) o;

        if (detid != that.detid) return false;
        if (ordersmid != null ? !ordersmid.equals(that.ordersmid) : that.ordersmid != null) return false;
        if (osnum != null ? !osnum.equals(that.osnum) : that.osnum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = detid;
        result = 31 * result + (ordersmid != null ? ordersmid.hashCode() : 0);
        result = 31 * result + (osnum != null ? osnum.hashCode() : 0);
        return result;
    }
}
