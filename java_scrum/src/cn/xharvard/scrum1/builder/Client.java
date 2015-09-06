package cn.xharvard.scrum1.builder;

public class Client {

	public static void main(String[] args) {
		IHouseBuilder cbuilder = new ChinaStyleHouseBuilderImpl();
		House chouse = new HouseDirector().buildHouse(cbuilder);
		System.out.println("--------------------");
		System.out.println("房门属性：" + chouse.getDoor());
		System.out.println("墙壁属性：" + chouse.getWall());
		System.out.println("地板属性：" + chouse.getFloor());
		System.out.println("窗户属性：" + chouse.getWindows());
		System.out.println("--------------------");
		IHouseBuilder ebuilder = new BritishStyleHouseBuilderImpl();
		House ehouse = new HouseDirector().buildHouse(ebuilder);
		System.out.println("房门属性：" + ehouse.getDoor());
		System.out.println("墙壁属性：" + ehouse.getWall());
		System.out.println("地板属性：" + ehouse.getFloor());
		System.out.println("窗户属性：" + ehouse.getWindows());
		System.out.println("--------------------");
	}

}