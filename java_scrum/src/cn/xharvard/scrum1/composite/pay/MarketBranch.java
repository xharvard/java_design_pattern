package cn.xharvard.scrum1.composite.pay;

import java.util.ArrayList;
import java.util.List;

/**
 * 分店，其下可以有加盟店
 */
public class MarketBranch extends Market {

	// 加盟店列表
	List<Market> list = new ArrayList<Market>();

	public MarketBranch(String str) {
		this.name = str;
	}

	@Override
	public void add(Market m) {
		list.add(m);
	}

	@Override
	public void payByCard() {
		System.out.println(name + "消费,积分已累加入该会员卡");
		for (Market m : list) {
			m.payByCard();
		}
	}

	@Override
	public void remove(Market m) {
		list.remove(m);
	}

}
