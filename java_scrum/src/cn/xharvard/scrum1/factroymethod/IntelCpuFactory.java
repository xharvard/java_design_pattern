package cn.xharvard.scrum1.factroymethod;

/**
 * Intel CPU 工厂类
 */
public class IntelCpuFactory implements MethodFactory{

	public Icpu createCpu() {
		Icpu cpu = new IntelCpu(755);
		return cpu;
	}
}