package solution1.enum_demo;

enum Singleton {
	INSTANCE;
}

public class EnumDemo {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		
		System.out.println(instance1.INSTANCE.hashCode());
		System.out.println(instance2.INSTANCE.hashCode());
	}
}
