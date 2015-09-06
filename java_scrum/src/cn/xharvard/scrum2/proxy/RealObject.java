package cn.xharvard.scrum2.proxy;

/**
 * 　目标对象角色
 */
public class RealObject implements AbstractObject {

	@Override
	public void operation() {
		System.out.println("一些操作");
	}

}
