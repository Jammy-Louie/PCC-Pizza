package com.pivotal.pccpizza.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topping {

    @Id
    @GeneratedValue
    private int id;

    private String toppingName;

    public int getId() {
        return id;
    }

    public Topping() {}

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }
}
