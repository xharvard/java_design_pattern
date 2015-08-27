package cn.xharvard.scrum1.observer.java;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

	public Watcher(Observable obs) {
		obs.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(((Watched) o).getData());
	}

}
