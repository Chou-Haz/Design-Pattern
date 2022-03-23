public class IngredientFacTest {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza);

		System.out.println();

		pizzaStore = new NYPizzaStore();
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza);
	}
}