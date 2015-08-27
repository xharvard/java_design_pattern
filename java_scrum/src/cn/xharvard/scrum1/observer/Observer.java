package cn.xharvard.scrum1.observer;

/**
 * 为所有的具体观察者定义一个接口，在得到主题的通知时更新自己。
 */
public interface Observer {
	
	/**
	 * 更新接口
	 * @param state 更新状态
	 */
	public void update(String state);
	
	// 拉模型的接口
	public void update2(Subject subject);
	
}
