package try_1;
//  ��������
public class Demo {
	int div (int a,int b) throws FushuException{ //�׳��쳣���׸������� 
		if (b<0){FushuException F = new FushuException("����Ϊ��",b);
			throw F;
		}
		//����Ҫ�׳��쳣 �Ǹ����Ժ�������try ץ���쳣  
		//����ͻ�˵try�ӿ���û���쳣���Բ��������	
		return a/b;
	}
}
