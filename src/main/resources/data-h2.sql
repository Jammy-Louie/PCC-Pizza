INSERT INTO TOPPING (ID, TOPPING_NAME) VALUES
(1, 'Pepperoni'),
(2, 'Cheese'),
(3, 'Anchovies'),
(4, 'Peppers'),
(5, 'Sasuage'),
(6, 'Mushrooms');

INSERT INTO SAUCE (ID, SAUCE_NAME) VALUES
(1, 'Tomato'),
(2, 'Alfredo');

INSERT INTO PIZZA (ID, PIZZA_NAME, SAUCE_ID) VALUES
(1, 'Pepperoni Pizza', 1);

INSERT INTO PIZZA_TOPPINGS VALUES
(1, 1),
(1, 2);