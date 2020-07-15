package kr.co.ca;

import com.naver.UserRunnable1;
import com.naver.UserThread1;

public class MainEx5 {

	public static void main(String[] args) {
		System.out.println("Main start");
		
		UserThread1 ut1 = new UserThread1();
		ut1.start();
		
		UserRunnable1 ur1 = new UserRunnable1();
		Thread urt = new Thread(ur1);
		urt.start();
		
		
		try {
			ut1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ut1 thread가 항상 main thread보다 작업이 일찍 끝나게
		
		
		System.out.println("Main end");

	}

}
