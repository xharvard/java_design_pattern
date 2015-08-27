package cn.xharvard.scrum1.observer.java;

public class Client {

	public static void main(String[] args) {

		//创建被观察者对象
		Watched watched = new Watched();
		
		//创建观察者对象，并将被观察者对象登记
		Watcher watcher = new Watcher(watched);

		//给被观察者状态赋值
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");
		watched.setData("stop");
	}

}