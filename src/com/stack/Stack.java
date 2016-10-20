package com.stack;

/*
 * ����ջ��topָ��ջ����һ��Ԫ�ؼ�ʵ�ʳ���
 */
public class Stack implements IStack{
	int top=-1;
	static int maxsize;
	int [] StackElem;
	public void SqStack(int max){
		top = 0;
		StackElem = new int [max];
	}
	public void clear (){
		top = 0;
	}
	public boolean isfull(){
		return top >= maxsize;
	}
	public boolean isEmpty(){
		return top == 0;
	}
	public int length (){
		return top;
	}
	public int peek(){
		if (!isEmpty()) return StackElem[top-1];
		else return -999;//�����׳��쳣��
	}
	public void push (int data){
		if (!isfull()){
			StackElem[top+1] = data;//�������˼�һ�ˣ������һ��Ԫ���ܵ�����ˣ�Ϊʲô��
		    top++;
		}
	}
	public int pop(){
		if (!isEmpty()){
			return StackElem[top--];
		}
		else return -999;//���׳��쳣
	}
	public void display(){
		int p=top;
		while (p!=0){//������isEmpty�ͻ�����ڶ������ǿ���ʹ�õģ����оͻ����һֱ���յ������ѭ��
			System.out.println(StackElem[p--]);
		}
	}

}
