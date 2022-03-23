public abstract class PizzaStore {
	abstract Pizza creatPizza(String type);

	public Pizza orderPizza(String type) {
		Pizza pizza = creatPizza(type);
		System.out.println("---Making a "+pizza.getName()+"---");
		System.out.println(pizza);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}