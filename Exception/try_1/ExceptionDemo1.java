package try_1;

public class ExceptionDemo1 {

	public static void main(String[] args){  //  ���Լ��� throws FushuException
		// TODO Auto-generated method stub
		Demo d  = new Demo();
		try {
			int x = d.div(4, -9);
			System.out.println("x="+x);
		}catch (FushuException F){
			
			System.out.println(F.toString());
			System.out.println(" ���������˸���");
			System.out.println("����ĸ����ǣ�"+F.getvalue());
		}
		System.out.println("over");

	}

}
