/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author jlamande
 */
//@XmlRootElement
public class SimpleBean {

    private String str;
    private int nb;
    private Boolean anotherAttribute;

    public SimpleBean() {
    }

    public SimpleBean(String str, int nb, Boolean anotherAttribute) {
        this.str = str;
        this.nb = nb;
        this.anotherAttribute = anotherAttribute;
    }

    public String getStr() {
        return str;
    }

    public int getNb() {
        return nb;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public Boolean getAnotherAttribute() {
        return anotherAttribute;
    }

    public void setAnotherAttribute(Boolean anotherAttribute) {
        this.anotherAttribute = anotherAttribute;
    }

}
