package cn.xharvard.scrum1.singleton;

public class Singleton3 {

	// 私有构造器，外面无法调用
	private Singleton3() {

	}

	private static Singleton3 singleton = null;

	// 双重检查锁定
	public static Singleton3 getInstance() {
		if (singleton == null) {
			synchronized (Singleton3.class) {
				if (singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}