package com.stack;

public class Node {
	public int data;
	public Node next;
	public Node (){
		//this (null,null) �����˵null����Node����
	}
	public Node(int data){
		this(data,null);
	}
	public Node(int data,Node next){
		this.data = data;
		this.next = next;
	}

}
