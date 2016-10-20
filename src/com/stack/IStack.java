package com.stack;

public interface IStack {
	public void clear();
	public boolean isEmpty();
	public int length ();
	public int peek();
	public void push(int data);
	//原文是这样的，但是还没好好学抛出异常，等以后来完善
	//public void push (int data)throws Exception
	public int pop();

}
