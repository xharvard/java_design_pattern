package cn.xharvard.scrum2.tank.staticproxy;

/**
 * 代理主题角色(日志)
 */
public class TanklogProxy implements Moveable {

	private Moveable moveable;

	public TanklogProxy(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

	@Override
	public void move() {
		System.out.println("start move......");
		moveable.move();
		System.out.println("end move......");
	}

}
