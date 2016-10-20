package Rewrite;

public class son extends father {
	
	public son(String name) {
		super(name);
	}

	int money;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int age=999;
	
	void show(){
		System.out.println("�����show����");
	}

}
