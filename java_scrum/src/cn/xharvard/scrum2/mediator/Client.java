package cn.xharvard.scrum2.mediator;

public class Client {

	public static void main(String[] args) {

		MainBoard mediator = new MainBoard();
		
		CDDriver cd = new CDDriver(mediator);
		CPU cpu = new CPU(mediator);
		VideoCard vCard = new VideoCard(mediator);
		SoundCard sCard = new SoundCard(mediator);
		
		mediator.setCdDriver(cd);
		mediator.setCpu(cpu);
		mediator.setvCard(vCard);
		mediator.setsCard(sCard);

		cd.readCD();
	}

}