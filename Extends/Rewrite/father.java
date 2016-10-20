package Rewrite;

public class father {
	//  父类有：age sex name 
	
	public    int  age=42;
	public String  name = "父亲";
	boolean sex;
	
	public  int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
 /////////////////静态区
	static {
		System.out.println("父类的初始化代码块\n\n");
	}
/////////////////	
	void show(){
		System.out.println("父类的show方法");
	}
	public father(String name) {//构造器
		this.name = name;
	}

}
