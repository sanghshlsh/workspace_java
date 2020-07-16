package kr.co.ca;

import com.naver.Cat;
import com.naver.CatImpl;
import com.naver.Dog;
import com.naver.Turtle;
import com.naver.TurtleImpl;

public class MainEx {

	public static void main(String[] args) {
		
		//구현되지 않은 인터페이스 객체 생성방법
		//1. 가장 옳지 않은 방법
		Dog d1 = new Dog() {
			
			@Override
			public void me1() {
				System.out.println("d1");
				
			}
		};
		d1.me1();
		
		
		//2.메서드 안에서 생성된 local inner class
		//보안에 우수하다.
		class DogImpl implements Dog{
			@Override
			public void me1() {
				// TODO Auto-generated method stub
				
			}
		}
		
		Dog d2 = new DogImpl();
		d2.me1();
		
		///////////////위가 기존 사용방법 아래가 lambda식
		
		//3.lambda
		Dog d = () -> {
			//me1 method overriding 코드 작성
			System.out.println("Dog 인터페이스의 me1()메서드 오버라이딩");
		};
		d.me1();
		
		//보편적인 인터페이스 객체생성방법
		Cat c2 = new CatImpl();
		c2.me2(5);
		
		
		//3.Lambda
		Cat c = (int a) -> {
			//me2 method overriding 코드 작성
			System.out.println("Cat lambda: "+a);
		};
		c.me2(10);
		
		
		System.out.println("::::::::::::::::::::::::::::::::");
		
		//2.local inner class
		class TurtleImplInnerClass implements Turtle{
			@Override
			public void me3(String str, int c) {
				System.out.println("Turtle impl Local Inner Class: "+str+" : "+c );
				
			}
		}
		
		Turtle t1 = new Turtle() {
			
			@Override
			public void me3(String str, int c) {
				System.out.println("Turtle: "+str+" : "+c);
			}
		};
		t1.me3("aaa", 1);
		
		
		Turtle t2 = new TurtleImplInnerClass();
		t2.me3("bbb", 2);
		
	
		Turtle t3 = new TurtleImpl();
		t3.me3("ccc", 3);
		
		
		Turtle t4 = (String str, int a) -> {
			System.out.println("Turtle lambda: "+str+" : "+a);	
		};		
		t4.me3("ddd", 4);
	}

}
