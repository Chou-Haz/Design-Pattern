public class DecoratorTestDrive {
	public static void main(String[] args) {
		Beverage b = new HouseBlend();
		Beverage b1 = new Milk(b);
		Beverage b12 = new Soy(b1);

		System.out.println(b12.getDescription());

		Beverage darkRoast = new DarkRoast();
		Beverage d1 = new Soy(darkRoast);
		Beverage d12 = new Milk(d1);

		System.out.println(d12.getDescription());
	}
}