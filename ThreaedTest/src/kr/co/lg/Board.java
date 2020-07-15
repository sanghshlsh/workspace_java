package kr.co.lg;

public class Board {

	private String content;
	
	boolean isOk = false;//setcontent 실행시 true로 변경
	
	public String getContent() {
		if (!isOk) {
			try {
				synchronized (this) {
					wait();	//Object class의 method wait()
							//try-catch작업이후 반드시 동기화 작업을 거쳐야 한다.
							//notify() or notifyAll() 호출시 까지  대기하는 method
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 		
		
		return content;
	}

	public void setContent(String content) {
		isOk = true;
		
		synchronized (this) {
			notifyAll();
		}	//wait과 같은 key로 동기화작업을 해야 한다.
		
		this.content = content;
	}
	

}
