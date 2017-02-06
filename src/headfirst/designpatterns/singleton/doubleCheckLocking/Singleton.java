package headfirst.designpatterns.singleton.doubleCheckLocking;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	/**
	 * double check idiom, Effective Java second edition P283
	 * @return
	 */
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
