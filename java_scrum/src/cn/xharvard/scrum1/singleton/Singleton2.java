package cn.xharvard.scrum1.singleton;

public class Singleton2 {
	
	// 私有构造器，外面无法调用
	private Singleton2() {

	}
	
	private static Singleton2 singleton = null;
	
	// 同步getInstance()方法
	public static synchronized Singleton2 getInstance(){
		if(singleton == null){
			singleton = new Singleton2();
		}
		return singleton;
	}
}