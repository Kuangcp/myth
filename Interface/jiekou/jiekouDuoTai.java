package jiekou;
/*
 * ������������˽ӿڵĶ�̬�ԣ�
 * ��Ϊ��̬��һ�������ڲ�ͬ�������ܳ��ֲ�ͬ��״̬�����ͣ�
 * 
 * ���������Ľṹ�������� �Ժ�ӽ�������ࣨʵ���˽ӿڣ�
 * ������Ϳ������Ϊ�ӽ����µĳ�������
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
class BYD implements car{//�¼ӵĳ���
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
		//������βξ���һ���ӿڣ��÷����Ժ�Ҫ�õ�ʱ��� ���Է��� �̳������car�ӿڵ��� �����Ķ��󣨶�̬�ԣ�
		System.out.println("������"+cars.getName()+"  ���ۣ�"+cars.getprice());
		money += cars.getprice();
	}
	public int  allmoney(){
		System.out.println("�ܼ��ǣ�"+money);
	   return money;
	}
}
public class jiekouDuoTai  {
	public  static void  main(String [] args){
	bmw c1 = new bmw();//Ҳ���Բ��½�����ֱ���ڵ��������½�Ҳ�ǿ��Ե�
	carshop s = new carshop();
	s.sellcar(c1);//�ǵõ��ñ��˵Ķ����ʱ����Ҫ��main�����вſ���
	s.sellcar(new qq());//���������ǲ�ͬ���࣬���Ǽ̳���ͬһ���ӿڣ��Ϳ������ڸ�sellcar������
	s.sellcar(new BYD());
	s.allmoney();
   }

}
