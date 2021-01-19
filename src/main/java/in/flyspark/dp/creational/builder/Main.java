package in.flyspark.dp.creational.builder;

public class Main {
	public static void main(String[] args) {

		Burger burger = new BurgerBuilder()
		.addBread("Brown Bread")
		.addPatty("Veggie")
		.addVeggies("Pickles")
		.addSauce("All")
		.addCheeze()
		.build();

		System.out.println(burger);
	}
}
