package cn.xharvard.scrum1.bridge;

/**
 * 女人
 */
public class Woman extends AbstractPeople {

	@Override
	public void run() {
		super.run();
		System.out.println("女人开着");

		road.run();
	}

}
