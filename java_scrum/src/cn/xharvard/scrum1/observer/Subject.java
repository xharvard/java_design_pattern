package cn.xharvard.scrum1.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类
 * 抽象主题角色把所有对观察者对象的引用保存在一个聚集（比如ArrayList对象）里，每个主题都可以有任何数量的观察者。
 * 
 */
public abstract class Subject {
	
	//用来保存注册的观察者对象
	private List<Observer> lists = new ArrayList<Observer>();
	
	/**
	 * 注册观察者对象
	 * @param obs 观察者对象
	 */
	public void attach(Observer obs){
		lists.add(obs);
	}

	/**
	 * 刪除观察者对象
	 * @param obs 观察者对象
	 */
	public void detach(Observer obs){
		lists.remove(obs);
	}
	
	/**
	 * 通知所以注冊的 观察者对象
	 * @param state 更新状态
	 */
	public void notifyObservers(String state){
		for(Observer observer : lists){
			observer.update(state);
		}
	}
	
	/**
	 * 通知所以注冊的 观察者对象(拉模型)
	 */
	public void notifyObservers2(){
		for(Observer observer : lists){
			observer.update2(this);
		}
	}
}
