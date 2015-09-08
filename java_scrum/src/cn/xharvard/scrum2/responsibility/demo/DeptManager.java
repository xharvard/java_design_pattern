package cn.xharvard.scrum2.responsibility.demo;

public class DeptManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String result = "";

		// 部门经理的权限只能在1000以内
		if (fee < 1000) {
			// 为了测试，简单点，只同意zhangsan的请求
			if ("zhangsan".equals(user)) {
				result = "成功：部门经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			} else {
				// 其他人一律不同意
				result = "失败：部门经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			}
		} else {
			// 超过1000，继续传递给级别更高的人处理
			if (getHandler() != null) {
				return getHandler().handleFeeRequest(user, fee);
			}
		}
		
		return result;
	}

}
