package cn.xharvard.scrum1.singleton;

public class Singleton4 {

	// 私有构造器，外面无法调用
	private Singleton4() {

	}

	// 静态内部类
	private static class LazyHolder {
		private static final Singleton4 INSTANCE = new Singleton4();
	}

	public static final Singleton4 getInstance() {
		return LazyHolder.INSTANCE;
	}
}