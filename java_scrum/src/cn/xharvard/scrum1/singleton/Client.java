package cn.xharvard.scrum1.singleton;

public class Client {

	public static void main(String[] args) {
		Singleton6 s = Singleton6.INSTANCE;
		Singleton6 s1 = Singleton6.INSTANCE;

		System.out.println(s == s1);
	}

}
