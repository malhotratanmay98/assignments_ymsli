//We will use readResolve method so the jvm will be restricted not to deserialize
//It will return the same hashcode.

package solution1.serialization;

import java.io.Serializable;

class SingletonSerializale implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public static SingletonSerializale singleton = null;

	private SingletonSerializale() {
	}

	public static synchronized SingletonSerializale getSingleton() {
		if (singleton == null) {
			
				singleton = new SingletonSerializale();
			
		}
		return singleton;
	}
	
	
	protected Object readResolve() {
		return getSingleton();
	}
	
}
public class DemoSerialization {
	
}
