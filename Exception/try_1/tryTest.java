package try_1;

import java.sql.Date;

public class tryTest {

	public static void main(String[] args) throws Exception{//����ע�����׳��쳣����������׳��쳣
		//���ҿ���֪���������Ǹ��쳣�Ǳ��׳�main�����ģ������׳�catch���
		// TODO Auto-generated method stub
		Date today = null;
		try {
			System.out.println("Begin ");
			today.toString();
			System.exit(0);
		}catch (Exception  e){
			System.out.println("Wrong");
			//throw e;//���������ע�͵������õ���ͬ�Ľ��
		}finally {
			System.out.println("Finally");
		}
		System.out.println("End");

	}

}
