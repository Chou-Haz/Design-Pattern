public class ClamPizza extends Pizza {
	IngredientFactory ingrediantFactory;

	public ClamPizza(IngredientFactory ingrediantFactory) {
		// name = "Clam Pizza";
		this.ingrediantFactory = ingrediantFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		sauce = ingrediantFactory.createSauce();
		dough = ingrediantFactory.createDough();
		cheese = ingrediantFactory.createCheese();
		clam = ingrediantFactory.createClam();
	}
}