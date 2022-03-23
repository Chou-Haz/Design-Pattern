import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	// Arraylist<String> toppings = new ArrayList<String>;

	public Pizza(){}

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("preparing "+name);
		System.out.println("baking "+name);
		System.out.println("cutting "+name);
		System.out.println("boxing "+name);
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("--"+name+"--\n");
		display.append("dough:"+dough);
		display.append("sauce:"+sauce);
		display.append("\n");

		return display.toString();
	}
}