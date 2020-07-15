package kr.co.ca;

import kr.co.lg.MyThread;
import kr.co.lg.SyncTest;

public class MainEx9 {
	public static void main(String[] args) {
		SyncTest st = new SyncTest();
		
		System.out.println(st.num);
		
		MyThread t1 = new MyThread(st);
		MyThread t2 = new MyThread(st);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//아직 동기화문제는 해결되지 않았다.
		System.out.println(st.num);
	}
}
