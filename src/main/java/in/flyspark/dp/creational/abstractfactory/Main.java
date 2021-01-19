package in.flyspark.dp.creational.abstractfactory;

public class Main {

	public static void main(String[] args) {

		WoodFurnaceFactory wFactory = new WoodFurnaceFactory();
		HeatPumpFactory hFactory = new HeatPumpFactory();

		HeatingSystemManager hsm = new HeatingSystemManager(hFactory);
		hsm.getHeatSystem().setTemperature();

		hsm.setHeatSystem(wFactory.makeHeatingSystem());
		hsm.getHeatSystem().setTemperature();
	}

}
