package com.pivotal.pccpizza.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sauce {

    @Id
    @GeneratedValue
    private int id;

    private String sauceName;

    public int getId() {
        return id;
    }

    public Sauce() {}

    public String getSauceName() {
        return sauceName;
    }

    public void setSauceName(String sauceName) {
        this.sauceName = sauceName;
    }
}
