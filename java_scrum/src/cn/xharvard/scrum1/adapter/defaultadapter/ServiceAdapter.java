package cn.xharvard.scrum1.adapter.defaultadapter;

/**
 * 给出所有方法的平庸的具体实现。这样，
 * 从这个抽象类再继承下去的子类就不必实现所有的方法了
 */
public abstract class ServiceAdapter implements AbstractService {

	@Override
	public void serviceOperation1() {

	}

	@Override
	public int serviceOperation2() {
		return 0;
	}

	@Override
	public String serviceOperation3() {
		return null;
	}

}
