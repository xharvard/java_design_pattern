package cn.xharvard.scrum1.abstractfactroy;

public class AmdFactory implements AbstractFactory {

	@Override
	public Icpu createCpu() {
		return new AmdCpu(938);
	}

	@Override
	public ImainBoard createMainBoard() {
		return new AmdMainBoard(938);
	}

}
