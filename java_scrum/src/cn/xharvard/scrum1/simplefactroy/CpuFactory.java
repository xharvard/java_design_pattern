package cn.xharvard.scrum1.simplefactroy;

/**
 * CPU 工厂类
 */
public class CpuFactory {
	
	public static Icpu createCpu(int type) {
		Icpu cpu = null;
		if (type == 1) {
			cpu = new IntelCpu(755);
		} else if (type == 2) {
			cpu = new AmdCpu(938);
		}

		return cpu;
	}
}