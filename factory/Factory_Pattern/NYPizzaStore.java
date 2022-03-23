public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String type){
		if (type.equals("Cheese")) {
			return new NYCheesePizza();
		}
		else if(type.equals("Clam")) {
			return new NYClamPizza();
		}
		else {
			return null;
		}
	}
}