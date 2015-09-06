package cn.xharvard.scrum1.factroymethod;

public class Client {

	public static void main(String[] args) {

		ComputerEngineer ce = new ComputerEngineer();
		MethodFactory mf = new IntelCpuFactory();
		ce.makeComputer(mf);
	}

}