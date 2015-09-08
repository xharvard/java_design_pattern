package cn.xharvard.scrum2.flyweight;

/**
 * 具体享元角色类
 */
public class ConcreteFlyweight implements Flyweight {

	// 内蕴参数
	private Character intrinsicState = null;
	
	/**
	 * 构造函数，内蕴状态作为参数传入
	 * @param state
	 */
	public ConcreteFlyweight(Character state){
		this.intrinsicState = state;
	}
	
	@Override
	public void operation(String state) {
		 System.out.println("Intrinsic State = " + this.intrinsicState);
	     System.out.println("Extrinsic State = " + state);
	}

}
