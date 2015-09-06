package cn.xharvard.scrum1.abstractfactroy;

public class Client {

	public static void main(String[] args) {

		ComputerEngineer ce = new ComputerEngineer();
		
		// 具体工厂实现
		AbstractFactory af = new AmdFactory();
		ce.makeComputer(af);
	}

}
