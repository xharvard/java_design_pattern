package cn.xharvard.scrum2.responsibility.demo;

public class Client {

	public static void main(String[] args) {

		// 组装责任链
		Handler pManager = new ProjectManager();
		Handler dManager = new DeptManager();
		Handler gManager = new GeneralManager();
		
		pManager.setHandler(dManager);
		dManager.setHandler(gManager);
		
		// 开始测试
		String test1 = pManager.handleFeeRequest("zhangsan", 300);
		System.out.println("test1 = " + test1);
		String test2 = pManager.handleFeeRequest("lisi", 300);
		System.out.println("test2 = " + test2);
		System.out.println("-----------------------------------------------------------");
		
		String test3 = pManager.handleFeeRequest("zhangsan", 600);
		System.out.println("test3 = " + test3);
		String test4 = pManager.handleFeeRequest("lisi", 600);
		System.out.println("test4 = " + test4);
		System.out.println("-----------------------------------------------------------");
		
		String test5 = pManager.handleFeeRequest("zhangsan", 3000);
		System.out.println("test5 = " + test5);
		String test6 = pManager.handleFeeRequest("lisi", 3000);
		System.out.println("test6 = " + test6);
	}

}
