package cn.xharvard.scrum1.composite.pay;

/**
 * 加盟店（最底层）
 */
public class MarketJoin extends Market {

	public MarketJoin(String str){
		this.name = str;
	}
	
	@Override
	public void add(Market m) {

	}

	@Override
	public void payByCard() {
		 System.out.println(name + "消费,积分已累加入该会员卡"); 
	}

	@Override
	public void remove(Market m) {

	}

}
