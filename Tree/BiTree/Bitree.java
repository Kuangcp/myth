package BiTree;
import java.util.*;
/*   ����һ������������ʽ�ṹ
 *  δ��
*/
public class Bitree {
	public Bitree root;
	public Object data;
	public Bitree lc;
	public Bitree rc;
	
	Scanner sc = new Scanner(System.in);
	public void Initiate(Bitree bt){//��ʼ��������
		bt.lc = bt.rc =null;
	}
	
	/*public Bitree Create(Bitree bt){        ����ɶ  ������һ�� �޹�ϵ�Ľڵ��ɶ��
		Object data = sc.next();
		if (data==".") bt=null;
		else {
			bt = new Bitree();
			bt.data = data;
		}
		return bt;	
	}*/
	
	public void Destory(Bitree bt){
		bt=null;
	}
	
	public boolean  Empty(Bitree bt){
		 return bt.lc ==null && bt.rc== null;
	}
	
	public Object Root(Bitree bt){
		return bt.data;
	}
	
	public Bitree Parent(Bitree bt,Object x){ //  ���׽ڵ�
		return bt;
	}
	public Bitree(String preOrder,String inOrder,int preIndex,int inIndex,int count ){
		if (count >0){   //�ȸ����и��ǿ�
			char r =preOrder.charAt(preIndex);//ȡ�ȸ����������еĵ�һ���ڵ���Ϊ���ڵ�
			int i = 0;
			for (;i<count;i++)
				if (r == inOrder.charAt(i+inIndex))  break ;
			//root = new BitreeNode(r);
		}
	
		
	}
	public void  Traverse(Bitree bt){//  �������������
		if (bt!=null){
			System.out.println(Root(bt));
			Traverse(bt.lc);
			Traverse(bt.rc);	
		}
	}
	
}
