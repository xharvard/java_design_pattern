package cn.xharvard.scrum1.composite.pay;

/**
 * 店的抽象类
 */
public abstract class Market {

	String name;

	public abstract void add(Market m);

	public abstract void remove(Market m);

	public abstract void payByCard();
}
