package cn.xharvard.scrum2.responsibility.demo;

public class ProjectManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String result = "";

		// 项目经理权限比较小，只能在500以内
		if (fee < 500) {
			// 为了测试，简单点，只同意zhangsan的请求
			if ("zhangsan".equals(user)) {
				result = "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			} else {
				// 其他人一律不同意
				result = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			}
		} else {
			// 超过500，继续传递给级别更高的人处理
			if (getHandler() != null) {
				return getHandler().handleFeeRequest(user, fee);
			}
		}

		return result;
	}

}
