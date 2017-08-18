package com.pivotal.pccpizza.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pizza {

    @Id
    @GeneratedValue
    private int id;

    private String pizzaName;

    @OneToOne
    @JoinColumn(name = "SAUCE_ID")
    private Sauce sauce;

    @OneToMany
    @JoinTable(name = "PIZZA_TOPPINGS")
    private Set<Topping> pizzaToppings;

    public Pizza() {}

    public Pizza(String pizzaName, Sauce sauce, Set<Topping> pizzaToppings) {
        this.pizzaName = pizzaName;
        this.sauce = sauce;
        this.pizzaToppings = pizzaToppings;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Set<Topping> getPizzaToppings() {
        return pizzaToppings;
    }

    public void setPizzaToppings(Set<Topping> pizzaToppings) {
        this.pizzaToppings = pizzaToppings;
    }
}
