package try_1;
/*
   NO SUCH FILE FOUBD
   Doing Finally
   -1
   ���뿪try ���� catch ��֮ǰִ��finally
   
   ���finally��return ����finally  <û�о���catch�����һ��Ϊ׼>? ����return ����Ĳ�������������ô������
*/
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 

public class try2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try2 u = new try2();
		System.out.println(u.method());
	}
	public int method(){
		int i =-1;
		try {
			FileInputStream Fi = new FileInputStream("hj.kl");
		}catch (FileNotFoundException H){
			System.out.println("NO SUCH FILE FOUND");
			 i++;  //��Ȼ�ǻ�������finally��
			return i;
			/* ��������
			 * i++;
			return i;*/
			//return -1;  
			// �����Ǻ������սᣬҪ��finally��ִ�У������ִ����return  �Ͳ����������finally������Դ��
			// ���catch�����ֶ��׳��쳣 ҲҪ��ִ��finally���׳�
			// ���뿪try ���� catch ��֮ǰִ��finally
		}catch (IOException jk){
		}finally{
			++i;   //��ôû�еõ�ִ�У�  �õ���ִ�У����Ǻ����ǲ�ͬ��ջ��i
			System.out.println(i);//��������� 0 ��Ȼ�ĵõ���ִ�� Ϊʲôcatch���return ��û�б��ء���
			System.out.println("Doing Finally");
			return i;// �������0 ����return��finally��Ϊ׼������ֵҲ��finally��
		}
		//���finally����return��� ���������unreachable code ���ɵ�����루�������룩
		//return 0; // �������finally ��������0 ��Ϊfinally��return����һ��catch���return���
	}

}
