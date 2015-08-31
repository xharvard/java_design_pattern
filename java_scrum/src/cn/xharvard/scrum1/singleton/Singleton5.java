package cn.xharvard.scrum1.singleton;

public class Singleton5 {

	// 私有构造器，外面无法调用
	private Singleton5() {

	}

	// 在类初始化时，已经自行实例化
	private static final Singleton5 singleton = new Singleton5();

	public static Singleton5 getInstance() {
		return singleton;
	}
}