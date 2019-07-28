// Lesson9 Task 1) Написать метод, который создаст список, положит в него 10 элементов, затем удалит первые два и последний, а затем выведет результат на экран.

package com.yandex.kbelyako;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		Random rand = new Random();
		 for (int i = 0; i < 10; i++) {
			 
			 int n = rand.nextInt(50);
			 testList.add(n);

			
		}
		

		System.out.println(Arrays.toString(testList.toArray()));
		testList.remove(0);
		testList.remove(0);
		testList.remove(testList.size()-1);
		
		System.out.println(Arrays.toString(testList.toArray()));
		

	}
}
