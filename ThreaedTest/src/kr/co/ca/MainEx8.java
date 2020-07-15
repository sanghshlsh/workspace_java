package kr.co.ca;

public class MainEx8 {
	public static void main(String[] args) {
		//보편적인 Thread 사용 형태
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//필요한 코드 작성
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
				
			}
		}).start();
		
		
		
		
	}
}
