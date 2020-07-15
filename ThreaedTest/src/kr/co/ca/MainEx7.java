package kr.co.ca;

import com.naver.UserRunnable1;
import com.naver.UserThread1;

public class MainEx7 {
	public static void main(String[] args) {
		System.out.println("main start");
		Thread ut1 = new UserThread1();
		ut1.start();
		
		Runnable ur1 = new UserRunnable1(ut1);
		Thread urt = new Thread(ur1);
		urt.start();
		
		System.out.println("main end");
	}
}
