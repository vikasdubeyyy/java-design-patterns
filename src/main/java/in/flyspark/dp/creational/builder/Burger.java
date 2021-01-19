package in.flyspark.dp.creational.builder;

public class Burger {
	private String bread;
	private String patty;
	private String veggies;
	private String sauces;
	private Boolean withExtraCheese = Boolean.FALSE;

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getPatty() {
		return patty;
	}

	public void setPatty(String patty) {
		this.patty = patty;
	}

	public String getVeggies() {
		return veggies;
	}

	public void setVeggies(String veggies) {
		this.veggies = veggies;
	}

	public String getSauces() {
		return sauces;
	}

	public void setSauces(String sauces) {
		this.sauces = sauces;
	}

	public Boolean getWithExtraCheese() {
		return withExtraCheese;
	}

	public void setWithExtraCheese(Boolean withExtraCheese) {
		this.withExtraCheese = withExtraCheese;
	}

	@Override
	public String toString() {
		return "Burger [bread=" + bread + ", patty=" + patty + ", veggies=" + veggies + ", sauces=" + sauces + ", withExtraCheese=" + withExtraCheese + "]";
	}

}