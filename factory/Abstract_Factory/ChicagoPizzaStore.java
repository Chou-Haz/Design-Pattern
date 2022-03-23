public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String type) {
		IngredientFactory chicagoIngrediantFac = new ChicagoIngrediantFac();
		Pizza pizza = null;

		if(type.equals("cheese")) {
			pizza = new CheesePizza(chicagoIngrediantFac);
			pizza.setName("Chicago Style Cheese Pizza");			
		}
		else if(type.equals("clam")) {
			pizza = new ClamPizza(chicagoIngrediantFac);
			pizza.setName("Clam Style Clam Pizza");

		}
		return pizza;
	}
}