package in.flyspark.dp.creational.singleton;

public class Singleton {

	private Singleton() {
	}

	public static final Singleton getInstance() {
		return LazyInit.INSTANCE;
	}

	/**
	 * 
	 * As for why thread-safe: 
	 * Because the first time getInstance() is called, the JVM will hold the holder class. 
	 * If another thread calls getInstance() concurrently, the JVM won't load the holder class a second time: 
	 * it will wait for the first thread to have completed the class loading, 
	 * and at the end of the loading and initialization of the holder class, 
	 * both thread will see the holder class properly initialized and thus containing the unique singleton instance.
	 */
	private static class LazyInit {
		private static final Singleton INSTANCE = new Singleton();
	}

}
