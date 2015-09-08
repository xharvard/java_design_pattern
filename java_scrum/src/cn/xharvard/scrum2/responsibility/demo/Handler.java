package cn.xharvard.scrum2.responsibility.demo;

/**
 * 抽象处理者角色
 */
public abstract class Handler {

	// 持有后继的责任对象
	protected Handler handler;

	public Handler getHandler() {
		return handler;
	}

	// 设置后继的责任对象
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	 /**
	 * 处理聚餐费用的申请
	 * @param user    申请人
	 * @param fee     申请的钱数
	 * @return        成功或失败的具体通知
	 */
    public abstract String handleFeeRequest(String user , double fee);
}
