package cn.xharvard.scrum2.tank.staticproxy;

/**
 * 代理主题角色
 */
public class TanktimeProxy implements Moveable {

	private Moveable moveable;

	public TanktimeProxy(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

	@Override
	public void move() {
		long timeBefore = System.currentTimeMillis();
		System.out.println("timeBefore=" + timeBefore);
		moveable.move();
		long timeAfter = System.currentTimeMillis();
		System.out.println("timeAfter=" + timeAfter);
		System.out.println("运行时间：" + (timeAfter - timeBefore));
	}

}
