public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		if(type.equals("Cheese")) {
			return new ChicagoCheesePizza();
		}
		else if(type.equals("Clam")) {
			return new ChicagoClamPizza();
		}
		else {
			return null;
		}
	}
}