package in.flyspark.dp.creational.abstractfactory;

public class HeatPump extends HeatingSystem {

	public void setTemperature() {
		System.out.println("heat-temp");
	}

	public void start() {
		System.out.println("heat-start");
	}

	public void stop() {
		System.out.println("heat-stop");
	}

}