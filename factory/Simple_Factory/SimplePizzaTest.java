public class SimplePizzaTest {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza);

		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza);
	}
}