package cn.xharvard.scrum1.bridge;

/**
 * 市区街道
 */
public class Street extends AbstractRoad {

	@Override
	public void run() {
		super.run();
		
		aCar.run();
		System.out.println("在市区街道行驶");
	}
}
