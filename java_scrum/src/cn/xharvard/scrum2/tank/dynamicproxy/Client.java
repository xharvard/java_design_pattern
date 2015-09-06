package cn.xharvard.scrum2.tank.dynamicproxy;

public class Client {

	public static void main(String[] args) {
		TankDynamicProxy proxy = new TankDynamicProxy();

		// 目标对象
		Moveable tank = new Tank();

		// 代理对象
		Moveable tankProxy = proxy.getProxy(tank);

		// 加入日志功能
		System.out.println("start move......");
		tankProxy.move();
		System.out.println("emd move......");
	}

}
