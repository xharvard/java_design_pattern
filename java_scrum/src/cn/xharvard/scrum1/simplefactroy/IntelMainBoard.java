package cn.xharvard.scrum1.simplefactroy;

public class IntelMainBoard implements ImainBoard {

	// cpu插槽孔数
	private int cpuHoles = 0;
	
	public IntelMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	@Override
	public void installCpu() {
		System.out.println("Intel主板的CPU插槽孔数是： " + cpuHoles);
	}

}
