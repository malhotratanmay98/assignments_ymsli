//If someone tries to clone, we will restrict that by throwing the cloneNotSupportedException
package solution1.cloning;

class Singleton implements Cloneable{
	private static volatile Singleton singleton = null;	

	private Singleton() {
	}

	public static synchronized Singleton getSingletonObject() {
		if (singleton == null) {
			if(singleton==null) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}

public class CloningDemo{
	public static void main(String[] args) {
		Singleton singleton=Singleton.getSingletonObject();
		System.out.println(singleton.hashCode());
		
		
		//someone tries to Make a clone
//		Singleton singleton2 =(Singleton) singleton.clone(); 
//		System.out.println(singleton2.hashCode()); 
		
		try {
			singleton.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}
}
