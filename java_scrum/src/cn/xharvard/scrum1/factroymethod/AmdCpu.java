package cn.xharvard.scrum1.factroymethod;

public class AmdCpu implements Icpu {

	// cpu 针脚
	private int pins = 0;

	public AmdCpu(int pins) {
		this.pins = pins;
	}

	@Override
	public void calculate() {
		System.out.println("AMD CPU的针脚数： " + pins);

	}

}