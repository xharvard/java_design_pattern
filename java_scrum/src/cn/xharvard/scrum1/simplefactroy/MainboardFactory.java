package cn.xharvard.scrum1.simplefactroy;

/**
 * 主板工厂类
 */
public class MainboardFactory {
	
	public static ImainBoard createMainboard(int type) {
		ImainBoard mainBoard = null;
		if (type == 1) {
			mainBoard = new IntelMainBoard(755);
		} else if (type == 2) {
			mainBoard = new AmdMainBoard(938);
		}

		return mainBoard;
	}
}