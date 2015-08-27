package cn.xharvard.scrum1.observer.impl;

public class Client {

	public static void main(String[] args) {
		// 创建主题对象
		ConcreteSubject subject = new ConcreteSubject();
		
		// 创建观察者对象
		ConcreteObserver observer = new ConcreteObserver();
		
		// 注册到主题对象
		subject.attach(observer);
		
		// 改变主题对象的状态
		subject.change("new state");
		
		// 改变主题对象的状态(拉模型)
		subject.change2("new state2");
	}

}
