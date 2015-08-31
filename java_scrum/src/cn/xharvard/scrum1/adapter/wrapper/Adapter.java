package cn.xharvard.scrum1.adapter.wrapper;

/**
 *  Adapter自身必须先拥有一个被适配类的对象， 再把具体的特殊功能委托给这个对象来实现。
 *  使用对象适配器模式，可以使得 Adapter类（适配类）根据传入的 Adaptee对象达到适配多个不同被适配类的功能。
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void operation1() {
		// 源类Adaptee有方法operation1,因此适配器类直接委派即可
		this.adaptee.operation1();
	}

	@Override
	public void operation2() {
		// 实现代码
	}

}
