public class CheesePizza extends Pizza {
	IngredientFactory ingrediantFactory;

	public CheesePizza(IngredientFactory ingrediantFactory) {
		// name = "Cheese Pizza";
		this.ingrediantFactory = ingrediantFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		sauce = ingrediantFactory.createSauce();
		dough = ingrediantFactory.createDough();
		cheese = ingrediantFactory.createCheese();		
	}
}