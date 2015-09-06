package cn.xharvard.scrum2.tank.dynamicproxy;

import java.lang.reflect.Proxy;

public class TankDynamicProxy {

	public Moveable getProxy(Moveable moveable) {
		
		return (Moveable) Proxy.newProxyInstance(moveable.getClass()
				.getClassLoader(), moveable.getClass().getInterfaces(),
				new TankInvocationHandler(moveable));
	}
}
