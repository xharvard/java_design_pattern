package cn.xharvard.scrum1.abstractfactroy;

/**
 * 抽象工厂接口 
 */
public interface AbstractFactory {

	// 创建CPU对象 
	public Icpu createCpu();
	
	// 创建主板对象
	public ImainBoard createMainBoard();
}
