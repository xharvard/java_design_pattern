package cn.xharvard.scrum2.tank.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TankInvocationHandler implements InvocationHandler {

	private Moveable moveable;

	public TankInvocationHandler(Moveable moveable) {
		this.moveable = moveable;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		method.invoke(moveable, args);
		
		return null;
	}

}
