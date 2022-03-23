public class NYIngrediantFac implements IngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new TomatoSauce();
	}

	public Cheese createCheese() {
		return new FranceCheese();
	}

	public Clam createClam() {
		return new FrozenClam();
	}
}