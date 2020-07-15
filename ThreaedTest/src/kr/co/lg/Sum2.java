package kr.co.lg;

public class Sum2 {
	public int num1;
	//Critical Section
	
	public int num2;
	public int num3;
	
	Object key1 = new Object();
	Object key2 = new Object();
	Object key3 = new Object();
	
	public void addNum1(int n) {
		synchronized (this) {
			num1 = num1 + n;
		}
		//동기화 block
		//this 자리에 key1을 넣어도 된다.(부모객체이기 떄문에)
	}

	
	public void addNum2(int n) {
		synchronized (key1) {
			num2 = num2 + n;
		}
	}
	//num1과 num2 사이에는 동기화문제가 발생하지 않는다.
	//이런 상황에서 synchronized의 key로 this를 사용하면 key가 하나이기에 오랜시간이 걸리는데
	//이런 상황을 해결하기위해 사로운 key를 생성해 넣어준다면 보다 빠른 작업이 가능하다.
	
	public void addNum3(int n) {
		synchronized (key2) {
			num3 = num3 + n;
		}
	}
	
	public void subNum1(int n) {
		synchronized (this) {
			num1 = num1 - n;
		}
	}
	//key3이라는 새로운키를 사용해 버리면 동기화문제가 발생해 버린다.
	
	public void subNum2(int n) {
		synchronized (key1) {
			num2 = num2 - n;
		}
	}

}
