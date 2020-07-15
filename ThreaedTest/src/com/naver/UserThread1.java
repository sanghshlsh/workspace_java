package com.naver;

public class UserThread1 extends Thread {
	//1. Thread class를 상속하는 자식 class 생성
	
	
	//2. 사용자 Thread에서 실행할 코드를 자식 class의 run() method에 작성
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
