package cn.xharvard.scrum1.simplefactroy;

public class IntelCpu implements Icpu {

	// cpu 针脚
	private int pins = 0;

	public IntelCpu(int pins) {
		this.pins = pins;
	}

	@Override
	public void calculate() {
		System.out.println("Intel CPU的针脚数： " + pins);
	}

}