//Issue in this is classes are instantiated at load time.
package solution1.eager;


class Singleton{
	
	public static Singleton singleton=new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
}
public class DemoEager {
	public static void main(String[] args) {
		Singleton singelton1=Singleton.getSingleton();
		Singleton singelton2=Singleton.getSingleton();
		
		System.out.println(singelton1.hashCode()+" "+singelton2.hashCode());
	}
}
