package com.pivotal.pccpizza.repository.jpa;

import com.pivotal.pccpizza.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Integer> {
}
