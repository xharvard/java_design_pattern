package cn.xharvard.scrum2.responsibility;

public class ConcreteHandler extends Handler {

	public ConcreteHandler() {
	}

	// 处理方法，调用此方法处理请求
	@Override
	public void handlerRequest() {
		
		// 判断是否有后继的责任对象,如果有，就转发请求给后继的责任对象,
		// 如果没有，则处理请求
		if(getHandler() != null){
			System.out.println("跳过请求");
			getHandler().handlerRequest();
		}else{
			System.out.println("处理请求");
		}
		
	}

}
