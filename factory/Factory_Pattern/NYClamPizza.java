public class NYClamPizza extends Pizza {
	public NYClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
	}

	void box() {
		System.out.println("Place pizza in special NY style PizzaStore box");
	}
}