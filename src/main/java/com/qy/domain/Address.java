package com.qy.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/11/27.
 */
@Entity
public class Address {
    private int adid;
    private String username;
    private String name;
    private String atel;
    private String admsg;
    private Integer adstatus;

    @Id
    @Column(name = "adid")
    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "atel")
    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel;
    }

    @Basic
    @Column(name = "admsg")
    public String getAdmsg() {
        return admsg;
    }

    public void setAdmsg(String admsg) {
        this.admsg = admsg;
    }

    @Basic
    @Column(name = "adstatus")
    public Integer getAdstatus() {
        return adstatus;
    }

    public void setAdstatus(Integer adstatus) {
        this.adstatus = adstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (adid != address.adid) return false;
        if (username != null ? !username.equals(address.username) : address.username != null) return false;
        if (name != null ? !name.equals(address.name) : address.name != null) return false;
        if (atel != null ? !atel.equals(address.atel) : address.atel != null) return false;
        if (admsg != null ? !admsg.equals(address.admsg) : address.admsg != null) return false;
        if (adstatus != null ? !adstatus.equals(address.adstatus) : address.adstatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (atel != null ? atel.hashCode() : 0);
        result = 31 * result + (admsg != null ? admsg.hashCode() : 0);
        result = 31 * result + (adstatus != null ? adstatus.hashCode() : 0);
        return result;
    }
}
