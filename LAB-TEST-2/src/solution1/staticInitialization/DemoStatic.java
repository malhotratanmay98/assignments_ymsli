
package solution1.staticInitialization;

class SingletonStaticBlock{

	private static SingletonStaticBlock singleton;
    
    public SingletonStaticBlock() {}

    static {
        singleton = new SingletonStaticBlock();
    }
    
    public static SingletonStaticBlock getSingletonStaticBlock() {
    	return singleton;
    }
}
 
public class DemoStatic {

}
