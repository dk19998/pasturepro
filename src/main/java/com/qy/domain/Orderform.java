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
public class Orderform {
    private int orderid;
    private String username;
    private String name;
    private String tel;
    private String addrmsg;
    private String upaddress;
    private String sellmsg;
    private String intitle;
    private double money;
    private Integer orcode;
    private Integer oftid;
    private String oftime;

    @Id
    @Column(name = "orderid")
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
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
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "addrmsg")
    public String getAddrmsg() {
        return addrmsg;
    }

    public void setAddrmsg(String addrmsg) {
        this.addrmsg = addrmsg;
    }

    @Basic
    @Column(name = "upaddress")
    public String getUpaddress() {
        return upaddress;
    }

    public void setUpaddress(String upaddress) {
        this.upaddress = upaddress;
    }

    @Basic
    @Column(name = "sellmsg")
    public String getSellmsg() {
        return sellmsg;
    }

    public void setSellmsg(String sellmsg) {
        this.sellmsg = sellmsg;
    }

    @Basic
    @Column(name = "intitle")
    public String getIntitle() {
        return intitle;
    }

    public void setIntitle(String intitle) {
        this.intitle = intitle;
    }

    @Basic
    @Column(name = "money")
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Basic
    @Column(name = "orcode")
    public Integer getOrcode() {
        return orcode;
    }

    public void setOrcode(Integer orcode) {
        this.orcode = orcode;
    }

    @Basic
    @Column(name = "oftid")
    public Integer getOftid() {
        return oftid;
    }

    public void setOftid(Integer oftid) {
        this.oftid = oftid;
    }

    @Basic
    @Column(name = "oftime")
    public String getOftime() {
        return oftime;
    }

    public void setOftime(String oftime) {
        this.oftime = oftime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderform orderform = (Orderform) o;

        if (orderid != orderform.orderid) return false;
        if (Double.compare(orderform.money, money) != 0) return false;
        if (username != null ? !username.equals(orderform.username) : orderform.username != null) return false;
        if (name != null ? !name.equals(orderform.name) : orderform.name != null) return false;
        if (tel != null ? !tel.equals(orderform.tel) : orderform.tel != null) return false;
        if (addrmsg != null ? !addrmsg.equals(orderform.addrmsg) : orderform.addrmsg != null) return false;
        if (upaddress != null ? !upaddress.equals(orderform.upaddress) : orderform.upaddress != null) return false;
        if (sellmsg != null ? !sellmsg.equals(orderform.sellmsg) : orderform.sellmsg != null) return false;
        if (intitle != null ? !intitle.equals(orderform.intitle) : orderform.intitle != null) return false;
        if (orcode != null ? !orcode.equals(orderform.orcode) : orderform.orcode != null) return false;
        if (oftid != null ? !oftid.equals(orderform.oftid) : orderform.oftid != null) return false;
        if (oftime != null ? !oftime.equals(orderform.oftime) : orderform.oftime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (addrmsg != null ? addrmsg.hashCode() : 0);
        result = 31 * result + (upaddress != null ? upaddress.hashCode() : 0);
        result = 31 * result + (sellmsg != null ? sellmsg.hashCode() : 0);
        result = 31 * result + (intitle != null ? intitle.hashCode() : 0);
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (orcode != null ? orcode.hashCode() : 0);
        result = 31 * result + (oftid != null ? oftid.hashCode() : 0);
        result = 31 * result + (oftime != null ? oftime.hashCode() : 0);
        return result;
    }
}
