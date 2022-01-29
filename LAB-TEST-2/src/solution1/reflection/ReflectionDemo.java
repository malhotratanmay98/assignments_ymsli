package solution1.reflection;


class Singleton {

	private static volatile Singleton singleton = null;	

	private Singleton() {
	}

	public static synchronized Singleton getSingletonObject() {
		
		if (singleton != null) {
			throw new IllegalStateException();
		}
		return singleton;
	}
}

public class ReflectionDemo {
	public static void main(String[] args) {

		
	}
}
