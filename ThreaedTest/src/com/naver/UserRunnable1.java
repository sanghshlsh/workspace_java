package com.naver;

public class UserRunnable1 implements Runnable{
	
	private Thread ut1;	//ut1 thread가 항상 urt thread보다 작업이 일찍 끝나게 하려면 파라미터를 이곳에 넣어준다.
	
	//위 thread객체를 특정하기 위해  사용자생성자 사용
	public UserRunnable1() {
	}
	public UserRunnable1(Thread ut1) {
		super();
		this.ut1 = ut1;
	}


	//1. UserThread2 class 생성 단, Runnable Interface 구현	
	
	
	//2. run() method에 사용자 Thread에서 실행할 코드를 작성
	@Override
	public void run() {
	
		if (ut1!=null) {
			try {
				ut1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		for (int i = 0; i < 10; i++) {
			char c = (char) ('A'+i);
			System.out.println(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
