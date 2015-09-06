package cn.xharvard.scrum1.simplefactroy;

public class AmdMainBoard implements ImainBoard {

	// cpu插槽孔数
	private int cpuHoles = 0;
	
	public AmdMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	@Override
	public void installCpu() {
		System.out.println("AMD主板的CPU插槽孔数是： " + cpuHoles);
	}

}
