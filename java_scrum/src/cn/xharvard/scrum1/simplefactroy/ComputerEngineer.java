package cn.xharvard.scrum1.simplefactroy;

/**
 * 工程师
 */
public class ComputerEngineer {

	// 定义组装机需要的CPU
	private Icpu cpu = null;

	// 定义组装机需要的主板
	private ImainBoard mainBoard = null;

	public void makeComputer(int cpuType, int mainboardType) {
		
		// 直接从工厂类获取
		this.cpu = CpuFactory.createCpu(cpuType);
		this.mainBoard = MainboardFactory.createMainboard(mainboardType);

		// 测试零部件
		this.cpu.calculate();
		this.mainBoard.installCpu();
	}

}