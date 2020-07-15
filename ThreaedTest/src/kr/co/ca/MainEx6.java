package kr.co.ca;

import com.naver.UserRunnable1;
import com.naver.UserThread1;

public class MainEx6 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		Thread ut1 = new UserThread1();	//다형성을 이용해 객체를 생성해도 상관없다.
		ut1.start();
		Runnable ur1 = new UserRunnable1();
		Thread urt = new Thread(ur1);
		urt.start();
		
		try {
			urt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}
}
