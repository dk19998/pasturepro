package com.qy.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/11/27.
 */
@Entity
public class Arole {
    private int aroid;
    private Integer aroaid;
    private Integer arotype;

    @Id
    @Column(name = "aroid")
    public int getAroid() {
        return aroid;
    }

    public void setAroid(int aroid) {
        this.aroid = aroid;
    }

    @Basic
    @Column(name = "aroaid")
    public Integer getAroaid() {
        return aroaid;
    }

    public void setAroaid(Integer aroaid) {
        this.aroaid = aroaid;
    }

    @Basic
    @Column(name = "arotype")
    public Integer getArotype() {
        return arotype;
    }

    public void setArotype(Integer arotype) {
        this.arotype = arotype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arole arole = (Arole) o;

        if (aroid != arole.aroid) return false;
        if (aroaid != null ? !aroaid.equals(arole.aroaid) : arole.aroaid != null) return false;
        if (arotype != null ? !arotype.equals(arole.arotype) : arole.arotype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aroid;
        result = 31 * result + (aroaid != null ? aroaid.hashCode() : 0);
        result = 31 * result + (arotype != null ? arotype.hashCode() : 0);
        return result;
    }
}
