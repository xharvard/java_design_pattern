package cn.xharvard.scrum1.bridge;

/**
 * 汽车
 */
public class Car extends AbstractCar {

	@Override
	public void run() {
		super.run();
		System.out.println("小汽车");
	}

}
