package cn.xharvard.scrum1.observer.impl;

import cn.xharvard.scrum1.observer.Subject;

/**
 * 
 *将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知。
 */
public class ConcreteSubject extends Subject {

	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String newState){
		state = newState;
		
		//通知所以注冊的 观察者对象
		notifyObservers(state);
	}
	
	// 拉模型
	public void change2(String newState){
		state = newState;
		//通知所以注冊的 观察者对象
		notifyObservers2();
	}
}
