package cn.xharvard.scrum2.mediator;

/**
 * 显卡类，一个同事类
 */
public class VideoCard extends Colleague {

	public VideoCard(Mediator mediator) {
		super(mediator);
	}

	/**
     * 显示视频数据
     * @param data 被显示的数据
     */
	public void showData(String data) {
		System.out.println("你正在观看的是： " + data);
	}
}
