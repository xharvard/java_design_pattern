package cn.xharvard.scrum1.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDemo {

	/**
	 * 抽象组件
	 */
	public abstract class Component {
		String name;

		public abstract void add(Component c);

		public abstract void remove(Component c);

		public abstract void eachChild();
	}

	/**
	 * 部件类（叶子节点）
	 */
	public class Leaf extends Component {

		// 叶子节点不具备添加的能力，所以不实现
		@Override
		public void add(Component c) {
			System.out.println("");
		}

		// 叶子节点不具备删除的能力，所以不实现
		@Override
		public void eachChild() {
			System.out.println(name + "执行了");
		}

		// 叶子节点没有子节点所以显示自己的执行结果
		@Override
		public void remove(Component c) {
			System.out.println("");
		}

	}

	/**
	 * 组合类（叶子节点的上层）
	 */
	public class Composite extends Component {

		// 用来保存节点的子节点
		List<Component> list = new ArrayList<Component>();

		@Override
		public void add(Component c) {
			list.add(c);
		}

		@Override
		public void eachChild() {
			System.out.println(name + "执行了");
			for (Component c : list) {
				c.eachChild();
			}
		}

		@Override
		public void remove(Component c) {
			list.remove(c);

		}

	}

	public static void main(String[] args) {
		CompositeDemo demo = new CompositeDemo();
		
		// 根节点
		Composite root = demo.new Composite();
		root.name = "根节点";
		
		// 左节点
		Composite left = demo.new Composite();
		left.name= "左节点";
		
		// 右节点
		Composite right = demo.new Composite();
		right.name= "右节点";
		
		// 右-子节点1
		Leaf rightLeaf1 = demo.new Leaf();
		rightLeaf1.name = "右-子节点1";
		
		// 右-子节点2
		Leaf rightLeaf2 = demo.new Leaf();
		rightLeaf2.name = "右-子节点2";
		
		// 加入右节点
		right.add(rightLeaf1);
		right.add(rightLeaf2);
		
		// 加入根节点
		root.add(left);
		root.add(right);
		
		root.eachChild();
	}

}