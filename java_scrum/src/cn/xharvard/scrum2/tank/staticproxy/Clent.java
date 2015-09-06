package cn.xharvard.scrum2.tank.staticproxy;

public class Clent {

	public static void main(String[] args) {
		Tank t = new Tank();
		
		// 时间代理
		Moveable move = new TanktimeProxy(t);
		
		// 日志代理
		Moveable movelog = new TanklogProxy(t);
		
//		move.move();
		movelog.move();
	}

}
