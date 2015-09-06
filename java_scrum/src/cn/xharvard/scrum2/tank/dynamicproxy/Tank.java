package cn.xharvard.scrum2.tank.dynamicproxy;

/**
 * 实际被代理对象
 */
public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank Moving......");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
