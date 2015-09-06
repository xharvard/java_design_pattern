package cn.xharvard.scrum2.proxy;

/**
 * 代理对象角色
 */
public class ProxyObject implements AbstractObject {

	RealObject realObj = new RealObject();

	@Override
	public void operation() {
		// 调用目标对象之前可以做相关操作
		System.out.println("before");

		// 调用目标对象
		realObj.operation();

		// 调用目标对象之后可以做相关操作
		System.out.println("after");

	}

}
