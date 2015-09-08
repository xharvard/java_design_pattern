package cn.xharvard.scrum2.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色类
 */
public class FlyweightFactory {

	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

	public Flyweight factory(Character state) {
		// 先从缓存中查找对象
		Flyweight fly = files.get(state);

		if (fly == null) {
			// 如果对象不存在则创建一个新的Flyweight对象
			fly = new ConcreteFlyweight(state);
			// 把这个新的Flyweight对象添加到缓存中
			files.put(state, fly);
		}

		return fly;
	}
}
