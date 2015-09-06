package cn.xharvard.scrum1.builder;

public class HouseDirector {

	public House buildHouse(IHouseBuilder builder) {

		builder.buildDoor();

		builder.buildFloor();

		builder.buildWall();

		builder.buildWindows();

		return builder.getHouse();
	}
}
