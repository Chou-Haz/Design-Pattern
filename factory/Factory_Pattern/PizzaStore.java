public abstract class PizzaStore {

 	public void orderPizza(String item) {
 		Pizza pizza = createPizza(item);

 		pizza.prepare();
 		pizza.bake();
 		pizza.cut();
 		pizza.box();
 	}

 	abstract Pizza createPizza(String type);

}