public class ChicagoClamPizza extends Pizza {
	public ChicagoClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}