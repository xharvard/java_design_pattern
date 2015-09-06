package cn.xharvard.scrum1.abstractfactroy;

public class IntelFactory implements AbstractFactory {

	@Override
	public Icpu createCpu() {
		return new IntelCpu(755);
	}

	@Override
	public ImainBoard createMainBoard() {
		return new IntelMainBoard(755);
	}

}
