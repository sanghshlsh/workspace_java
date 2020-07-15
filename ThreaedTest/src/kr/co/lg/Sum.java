package kr.co.lg;

public class Sum {
	public int num1;
	//Critical Section
	public synchronized void addNum1(int n) {
		num1 = num1 + n;
	}
	//1. µø±‚»≠ method
	

}
