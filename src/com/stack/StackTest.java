package com.stack;
import java.util.*;
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������ռ䣺");
		Scanner p = new Scanner(System.in);
		Stack.maxsize = p.nextInt();
		p.close();
		
		Stack s1 = new Stack();
		s1.clear();
		s1.SqStack(Stack.maxsize);
		for (int i=0;i<3;i++){
			s1.push(i);
		}
		s1.display();
		

	}

}
