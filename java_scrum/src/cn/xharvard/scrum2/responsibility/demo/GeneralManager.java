package cn.xharvard.scrum2.responsibility.demo;

public class GeneralManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String result = "";

		// 总经理的权限很大，只要请求到了这里，他都可以处理
		if (fee >= 1000) {
			// 为了测试，简单点，只同意zhangsan的请求
			if ("zhangsan".equals(user)) {
				result = "成功：总经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			} else {
				// 其他人一律不同意
				result = "失败：总经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			}
		} else {
			// 如果还有后继的处理对象，继续传递
			if (getHandler() != null) {
				return getHandler().handleFeeRequest(user, fee);
			}
		}

		return result;
	}

}
