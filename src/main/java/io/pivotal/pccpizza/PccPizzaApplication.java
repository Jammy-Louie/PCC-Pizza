package io.pivotal.pccpizza;

import org.apache.geode.cache.query.CqEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.gemfire.config.annotation.EnableContinuousQueries;
import org.springframework.data.gemfire.listener.annotation.ContinuousQuery;

@SpringBootApplication
@EnableCaching
@EnableContinuousQueries
public class PccPizzaApplication {
//	@ContinuousQuery( name="PizzaOrderCQ", query="SELECT * FROM /PizzaOrder")
//	private void handleCQEvent(CqEvent event){
//		System.out.println("HELLO I AM PIZZA MCPIZZA FACE");
//	}

	public static void main(String[] args) {
		SpringApplication.run(PccPizzaApplication.class, args);
	}
}
