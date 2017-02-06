package headfirst.designpatterns.singleton.doubleCheckLocking;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
	}
}
