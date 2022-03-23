public class PizzaFactoryTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("Cheese");
		nyStore.orderPizza("Clam");
	}
}