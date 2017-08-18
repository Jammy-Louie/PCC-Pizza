package com.pivotal.pccpizza.service;

import com.pivotal.pccpizza.model.Pizza;
import com.pivotal.pccpizza.model.Topping;
import com.pivotal.pccpizza.model.Sauce;
import com.pivotal.pccpizza.repository.jpa.PizzaRepository;
import com.pivotal.pccpizza.repository.jpa.ToppingRepository;
import com.pivotal.pccpizza.repository.jpa.SauceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PizzaService {

    private PizzaRepository pizzaRepository;
    private ToppingRepository toppingRepository;
    private SauceRepository sauceRepository;

    @Autowired
    public PizzaService(
            PizzaRepository pizzaRepository,
            ToppingRepository pizzaToppingRepository,
            SauceRepository sauceRepository
    ){
        super();
        this.pizzaRepository = pizzaRepository;
        this.toppingRepository = pizzaToppingRepository;
        this.sauceRepository = sauceRepository;
    }

    public Set<Topping> getPizzaAllToppings(){
        return new HashSet<Topping>(toppingRepository.findAll());
    }

    public Set<Sauce> getAllSauces(){
        return new HashSet<Sauce>(sauceRepository.findAll());
    }

    public void CreatePizza(String name, Sauce sauce, Set<Topping> toppings){
        pizzaRepository.save(new Pizza(name, sauce, toppings));
    }

    @Cacheable("Pizza")
    public List<Pizza> getAllPizzas(){
        this.simulateSlowService();
        return pizzaRepository.findAll();
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
