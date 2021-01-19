package in.flyspark.dp.creational.abstractfactory;

public class HeatPumpFactory implements HeatingSystemFactory {

	public HeatingSystem makeHeatingSystem() {
		return new HeatPump();
	}

}