package kr.co.ca;

import com.naver.UserRunnable1;

public class MainEx3 {

	public static void main(String[] args) {
		System.out.println("main start");
		UserRunnable1 ur1 = new UserRunnable1();
		//3. UserRunnable Class를이용 runnable 객체 생성
		Thread urt1 = new Thread(ur1);
		//4. Thread Class 이용 Thread 객체 생성(runnable 객체를 parameter로 넘긴다.)
		urt1.start();
		//5. thread 객체가 갖고 있는 start() method 호출
		System.out.println("main end");
	}

}
