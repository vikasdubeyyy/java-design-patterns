package in.flyspark.dp.creational.builder;

public class BurgerBuilder {
	private Burger burger;

	public BurgerBuilder() {
		this.burger = new Burger();
	}

	public BurgerBuilder addBread(String bread) {
		burger.setBread(bread);
		return this;
	}

	public BurgerBuilder addPatty(String patty) {
		burger.setPatty(patty);
		return this;
	}

	public BurgerBuilder addVeggies(String veggies) {
		burger.setVeggies(veggies);
		return this;
	}

	public BurgerBuilder addSauce(String sauce) {
		burger.setSauces(sauce);
		return this;
	}

	public BurgerBuilder addCheeze() {
		burger.setWithExtraCheese(Boolean.TRUE);
		return this;
	}

	public Burger build() {
		return this.burger;
	}
}