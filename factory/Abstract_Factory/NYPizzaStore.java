public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String type) {
		Pizza pizza = null;
		IngredientFactory nyIngrediantFac = new NYIngrediantFac();

		if(type.equals("cheese")) {
			pizza = new CheesePizza(nyIngrediantFac);
			pizza.setName("New York Style Cheese Pizza");
		}
		else if(type.equals("clam")) {
			pizza = new ClamPizza(nyIngrediantFac);
			pizza.setName("New York Style Clam Pizza");			
		}
		return pizza;
	}
}