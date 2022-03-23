public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Cheese cheese;

	Clam clam = null;

	// IngrediantFactory ingrediantFactory;
	// Arraylist<String> toppings = new ArrayList<String>;

	// public Pizza(IngrediantFactory ingrediantFactory){
	// 	this.ingrediantFactory = ingrediantFactory;
	// 	dough = ingrediantFactory.createDough();
	// 	sauce = ingrediantFactory.createSauce();
	// }

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
	}

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}


	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("--"+name+"--\n");
		display.append(" dough:"+dough);
		display.append(" sauce:"+sauce);
		display.append(" cheese:"+cheese);
		display.append(" Clam:"+clam);
		display.append("\n");

		return display.toString();
	}
}