package in.flyspark.dp.creational.abstractfactory;

public class WoodFurnaceFactory implements HeatingSystemFactory {

	public HeatingSystem makeHeatingSystem() {
		return new WoodFurnace();
	}

}
