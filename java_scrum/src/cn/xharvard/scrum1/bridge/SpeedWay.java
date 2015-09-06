package cn.xharvard.scrum1.bridge;

/**
 * 高速公路
 */
public class SpeedWay extends AbstractRoad {

	@Override
	public void run() {
		super.run();
		
		aCar.run();
		System.out.println("在高速公路行驶");
	}
}