package cn.xharvard.scrum1.bridge;

/**
 * 公交车
 */
public class Bus extends AbstractCar {

	@Override
	public void run() {
		super.run();
		System.out.println("公交车");
	}

}