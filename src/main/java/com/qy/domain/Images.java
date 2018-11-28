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
public class Images {
    private int id;
    private String img;
    private Integer sortnum;
    private String itime;
    private Integer istatus;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "sortnum")
    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    @Basic
    @Column(name = "itime")
    public String getItime() {
        return itime;
    }

    public void setItime(String itime) {
        this.itime = itime;
    }

    @Basic
    @Column(name = "istatus")
    public Integer getIstatus() {
        return istatus;
    }

    public void setIstatus(Integer istatus) {
        this.istatus = istatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Images images = (Images) o;

        if (id != images.id) return false;
        if (img != null ? !img.equals(images.img) : images.img != null) return false;
        if (sortnum != null ? !sortnum.equals(images.sortnum) : images.sortnum != null) return false;
        if (itime != null ? !itime.equals(images.itime) : images.itime != null) return false;
        if (istatus != null ? !istatus.equals(images.istatus) : images.istatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (sortnum != null ? sortnum.hashCode() : 0);
        result = 31 * result + (itime != null ? itime.hashCode() : 0);
        result = 31 * result + (istatus != null ? istatus.hashCode() : 0);
        return result;
    }
}
