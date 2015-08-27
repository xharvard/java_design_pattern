package cn.xharvard.scrum1.observer.impl;

import cn.xharvard.scrum1.observer.Observer;
import cn.xharvard.scrum1.observer.Subject;

public class ConcreteObserver implements Observer {

	//观察者的状态
    private String observerState;
    
	@Override
	public void update(String state) {
		
		// 更新观察者的状态，使其与目标的状态保持一致
		observerState = state;
		System.out.println("状态为： "+observerState);
	}

	// 拉模型的接口
	@Override
	public void update2(Subject subject) {
		// 更新观察者的状态，使其与目标的状态保持一致
		observerState = ((ConcreteSubject)subject).getState();
		System.out.println("拉模型状态为： "+observerState);
	}

}
