package com.abstracts;

public  class AbstractA {
	int a;
	String b;
	public AbstractA(){System.out.println("Abstract 空构造器");}
	
	public AbstractA(int a, String b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Abstract 含参构造器");
	}

	public AbstractA(String b) {
		super();
		this.b = b;
	}
	public AbstractA(int a) {
		super();
		this.a = a;
	}
	//public abstract void M();
}
