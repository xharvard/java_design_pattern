package cn.xharvard.scrum1.factroymethod;

/**
 * 工程师
 */
public class ComputerEngineer {

	// 定义组装机需要的CPU
	private Icpu cpu = null;


	public void makeComputer(MethodFactory mf) {
		
		// 直接从工厂类获取
		this.cpu = mf.createCpu();

		// 测试零部件
		this.cpu.calculate();
	}

}