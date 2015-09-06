package cn.xharvard.scrum1.facade;

/**
 * 门面角色类
 */
public class Facade {
	
	// 对外提供的方法
	public void test(){
		ModuleA a = new ModuleA();
		ModuleB b = new ModuleB();
		ModuleC c = new ModuleC();
		
		// 内部系统用方法，不对外提供
		// a.innerA();
		a.testA();
		b.testB();
		c.testC();
	}

}
