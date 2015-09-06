package cn.xharvard.scrum1.factroymethod;

/**
 * AMd CPU 工厂类
 */
public class AmdCpuFactory implements MethodFactory{

	public Icpu createCpu() {
		Icpu cpu = new AmdCpu(938);
		return cpu;
	}
}