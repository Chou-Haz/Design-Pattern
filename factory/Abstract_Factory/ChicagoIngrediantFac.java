public class ChicagoIngrediantFac implements IngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PeanutSauce();
	}

	public Cheese createCheese() {
		return new SwedishCheese();
	}

	public Clam createClam() {
		return new FreshClam();
	}
}