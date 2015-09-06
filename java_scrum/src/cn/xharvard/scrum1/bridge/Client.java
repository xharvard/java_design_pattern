package cn.xharvard.scrum1.bridge;

public class Client {

	public static void main(String[] args) {

		AbstractRoad speedWay = new SpeedWay();
		speedWay.aCar = new Car();
		speedWay.run();

		AbstractRoad street = new Street();
		street.aCar = new Bus();
		street.run();
		
		System.out.println();
		System.out.println("加入'人'对象后的结果：----------");
		
		AbstractPeople man = new Man();
		AbstractRoad speedWay2 = new SpeedWay();
		speedWay2.aCar = new Car();
		man.road = speedWay2;
		man.run();
	}

}
