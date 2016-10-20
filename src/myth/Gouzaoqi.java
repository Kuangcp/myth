package myth;

class My{
	int id = 5;
	public My(int id){
		this.id = id;
	}
	public My(My my){//构造器 形参是自身的对象引用
		my.id = id;
		System.out.println(my);//my 是指向m1的
		my=null;
		
	}
	
	public String toString() {
		return "My [id=" + id + "]";
	}
	
}

public class Gouzaoqi {

	public static void main(String[] args) {

		My m1 = new My(10);
		My m2 = new My(m1);//m2的id是原本的id即5  这里就像是隐含了一个无参构造器来创建m2对象
		System.out.println("m1"+m1+"m2:"+m2);
	}

}
