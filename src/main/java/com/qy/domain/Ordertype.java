package com.qy.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/11/27.
 */
@Entity
public class Ordertype {
    private int otid;
    private String commsg;

    @Id
    @Column(name = "otid")
    public int getOtid() {
        return otid;
    }

    public void setOtid(int otid) {
        this.otid = otid;
    }

    @Basic
    @Column(name = "commsg")
    public String getCommsg() {
        return commsg;
    }

    public void setCommsg(String commsg) {
        this.commsg = commsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ordertype ordertype = (Ordertype) o;

        if (otid != ordertype.otid) return false;
        if (commsg != null ? !commsg.equals(ordertype.commsg) : ordertype.commsg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = otid;
        result = 31 * result + (commsg != null ? commsg.hashCode() : 0);
        return result;
    }
}
