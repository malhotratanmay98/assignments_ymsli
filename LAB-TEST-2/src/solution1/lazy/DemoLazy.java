package solution1.lazy;

//Lazy initialization has issue of race condition when two methods will call Singleton
//using volatile guarantees that a fresh copy will be fetched every time(and not the cached value)

class Singleton {

	public static volatile Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

public class DemoLazy {
	public static void main(String[] args) {
		Singleton singleton=Singleton.getSingleton();
		Singleton singleton2=Singleton.getSingleton();
		
		
		System.out.println(singleton.hashCode()+" "+singleton2.hashCode());
		
		
	}
}
