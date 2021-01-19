package in.flyspark.dp.creational.abstractfactory;

public class WoodFurnace extends HeatingSystem {

	public void setTemperature() {
		System.out.println("wood-temp");
	}

	public void start() {
		System.out.println("wood-start");
	}

	public void stop() {
		System.out.println("wood-stop");
	}

}