package cn.xharvard.scrum1.bridge;

/**
 * 男人
 */
public class Man extends AbstractPeople {

	@Override
	public void run() {
		super.run();
		System.out.println("男人开着");

		road.run();
	}

}
