package kr.co.ca;

import kr.co.lg.Sum;
import kr.co.lg.YourThread;

public class MainEx10 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		long start = System.currentTimeMillis(); 
		Sum sum = new Sum();
		
		YourThread y1 = new YourThread(0, 5000, sum);
		YourThread y2 = new YourThread(5001, 10000, sum);
		y1.start();
		y2.start();
		try {
			y1.join();
			y2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis(); 
		System.out.println(end-start);
		System.out.println(sum.num1);
		System.out.println("Main End");
	}
}
