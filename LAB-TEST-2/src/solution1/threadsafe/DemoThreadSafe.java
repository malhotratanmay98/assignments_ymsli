//to make it thread safe, we will use synchronised keyword.
package solution1.threadsafe;

class Singleton {

	public static Singleton singleton = null;

	private Singleton() {
	}

	public static synchronized Singleton getSingletonObject() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

public class DemoThreadSafe {
	public static void main(String[] args) {

	}
}
