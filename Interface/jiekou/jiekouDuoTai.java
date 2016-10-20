package jiekou;
/*
 * 这个就是体现了接口的多态性，
 * 何为多态：一个引用在不同环境下能呈现不同的状态（类型）
 * 
 * 而且这样的结构还有益于 以后加进来别的类（实现了接口）
 * 在这里就可以理解为加进来新的车的种类
 */
class bmw implements car{
	public String getName(){
		return "BMW";
	}
	public int getprice(){
		return 100;
	}
}
class qq implements car {
	public String getName (){
		return "QQ";
	}
	public int getprice(){
		return 20;
	}
}
class BYD implements car{//新加的车种
	public String getName(){
		return "BYD";
	}
	public int getprice(){
		return 3;
	}
}
class carshop{
		
	int money = 0;
	public void sellcar(car cars){
		//这里的形参就是一个接口，该方法以后要用的时候就 可以放入 继承了这个car接口的类 创建的对象（多态性）
		System.out.println("车辆："+cars.getName()+"  单价："+cars.getprice());
		money += cars.getprice();
	}
	public int  allmoney(){
		System.out.println("总价是："+money);
	   return money;
	}
}
public class jiekouDuoTai  {
	public  static void  main(String [] args){
	bmw c1 = new bmw();//也可以不新建对象直接在调用那里新建也是可以的
	carshop s = new carshop();
	s.sellcar(c1);//记得调用别人的对象的时候是要在main方法中才可以
	s.sellcar(new qq());//这两个就是不同的类，但是继承了同一个接口，就可以用在该sellcar方法中
	s.sellcar(new BYD());
	s.allmoney();
   }

}
