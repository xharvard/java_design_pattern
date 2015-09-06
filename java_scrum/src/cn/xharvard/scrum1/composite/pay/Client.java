package cn.xharvard.scrum1.composite.pay;

public class Client {

	public static void main(String[] args) {
		MarketBranch root = new MarketBranch("总店");
		MarketBranch shBranch = new MarketBranch("上海分店");
		MarketJoin shjoin1 = new MarketJoin("上海分店黄浦区加盟店");
		MarketJoin shjoin2 = new MarketJoin("上海分店虹桥区加盟店");

		shBranch.add(shjoin1);
		shBranch.add(shjoin2);
		root.add(shBranch);

		root.payByCard();
	}

}