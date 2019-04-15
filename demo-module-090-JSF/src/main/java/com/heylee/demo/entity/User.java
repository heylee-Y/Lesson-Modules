package com.heylee.demo.entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class User {

    private String name;

    private Boolean showLevel = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSayName() {
        if ("".equals(name) || name == null) {
            return "Null Message";
        } else {
            return "Ajax message : Welcome " + name;
        }
    }

    public void chargeTypeChange() {
        if (showLevel) {
            System.out.println("set false");
            setShowLevel(false);
        }
        else {
            System.out.println("set true");
            setShowLevel(true);
        }
    }

    public Boolean getShowLevel() {
        if (showLevel == null) {
            System.out.println("init show level");
            showLevel = false;
        }
        System.out.println("show: " + showLevel);
        return showLevel;
    }

    public void setShowLevel(Boolean showLevel) {
        this.showLevel = showLevel;
    }
}
