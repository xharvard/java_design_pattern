package cn.xharvard.scrum2.mediator;

/**
 * 主板类，实现中介者接口
 */
public class MainBoard implements Mediator {

	private CDDriver cdDriver;
	private CPU cpu;
	private VideoCard vCard;
	private SoundCard sCard;

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setvCard(VideoCard vCard) {
		this.vCard = vCard;
	}

	public void setsCard(SoundCard sCard) {
		this.sCard = sCard;
	}

	@Override
	public void changed(Colleague colleague) {
		if (colleague == cdDriver) {
			// 表示光驱读取了数据
			this.operateCDDriverReadData((CDDriver) colleague);
		} else if (colleague == cpu) {
			// 表示CPU处理完数据
			this.operateCPU((CPU) colleague);
		}
	}

	/**
	 * 处理光驱读取数据后与其他对象的交互
	 */
	private void operateCDDriverReadData(CDDriver cd) {
		String data = cd.getData();
		this.cpu.executeData(data);
	}

	/**
	 * 处理CPU处理完数据后与其他对象的交互
	 * @param cpu
	 */
	private void operateCPU(CPU cpu) {
		String vData = cpu.getVideoData();
		String sData = cpu.getSoundData();
		this.vCard.showData(vData);
		this.sCard.soundData(sData);
	}

}
