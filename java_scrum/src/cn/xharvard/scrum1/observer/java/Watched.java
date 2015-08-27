package cn.xharvard.scrum1.observer.java;

import java.util.Observable;

/**
 *被观察者类
 */
public class Watched extends Observable {

	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if (!this.data.equals(data)) {
			this.data = data;
			// 将“已变化”设置为true
			setChanged();

		}

		// 通知所以注冊的 观察者对象
		notifyObservers();
	}
}
