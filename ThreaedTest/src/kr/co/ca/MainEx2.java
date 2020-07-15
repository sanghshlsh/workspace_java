package kr.co.ca;

import com.naver.UserThread1;

public class MainEx2 {
	
	public static void main(String[] args) {
		System.out.println("main start");
		UserThread1 ut1 = new UserThread1();
		//3. 자식 class를 이용해서 thread객체를 생성
		
		ut1.start();
		System.out.println("main end");
		//4. thread 객체가 갖고 있는 start() method 호출
	}
	
}
