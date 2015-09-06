package cn.xharvard.scrum1.facade;

/**
 * 子系统 A
 */
public class ModuleA {

	// 对外提供
	public void testA() {
		System.out.println("调用ModuleA中的testA方法");
	}
	
	// 内部系统用方法，不对外提供
	public void innerA() {
		System.out.println("调用ModuleA中的innerA方法");
	}
}