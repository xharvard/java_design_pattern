package cn.xharvard.scrum1.adapter;

/**
 * 适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口。
 * 由于Adaptee没有提供operation2()方法，而目标接口又要求这个方法，
 * 因此适配器角色Adapter实现了这个方法。
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void operation2() {
		// 实现代码
	}

}
