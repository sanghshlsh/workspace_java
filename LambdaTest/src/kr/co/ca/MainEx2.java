package kr.co.ca;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MainEx2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(500);
		set.add(3);
		set.add(11);
		
		System.out.println(":::::::::::::::::::::::::::::");
		//x�� ������ set�� ���� 5,500,3,11�� ������ ����.
		set.forEach(x ->{
			System.out.println(x);
			list.add(x);
			//�ۿ��� ����ϱ����� ����Ʈ�� �迭���
		});
		
		
		// ���Ʒ� ����.
		
		System.out.println(":::::::::::::::::::::::::::::");
		
		Iterator<Integer> it = set.iterator();
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			list.add(integer);
			//�ۿ��� ����ϱ����� ����Ʈ�� �迭���
		}
	}

}
