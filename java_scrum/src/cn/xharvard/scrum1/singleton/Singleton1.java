package cn.xharvard.scrum1.singleton;

public class Singleton1 {
	
	// 私有构造器，外面无法调用
	private Singleton1() {

	}
	
	private static Singleton1 singleton = null;
	
	public static Singleton1 getInstance(){
		if(singleton == null){
			singleton = new Singleton1();
		}
		return singleton;
	}
}