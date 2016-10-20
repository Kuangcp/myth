package BiTree;
import java.util.*;
/*   定义一个二叉树的链式结构
 *  未完
*/
public class Bitree {
	public Bitree root;
	public Object data;
	public Bitree lc;
	public Bitree rc;
	
	Scanner sc = new Scanner(System.in);
	public void Initiate(Bitree bt){//初始化二叉树
		bt.lc = bt.rc =null;
	}
	
	/*public Bitree Create(Bitree bt){        这是啥  ？建立一堆 无关系的节点干啥？
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
	
	public Bitree Parent(Bitree bt,Object x){ //  求父亲节点
		return bt;
	}
	public Bitree(String preOrder,String inOrder,int preIndex,int inIndex,int count ){
		if (count >0){   //先根和中根非空
			char r =preOrder.charAt(preIndex);//取先根遍历序列中的第一个节点作为根节点
			int i = 0;
			for (;i<count;i++)
				if (r == inOrder.charAt(i+inIndex))  break ;
			//root = new BitreeNode(r);
		}
	
		
	}
	public void  Traverse(Bitree bt){//  先序遍历二叉树
		if (bt!=null){
			System.out.println(Root(bt));
			Traverse(bt.lc);
			Traverse(bt.rc);	
		}
	}
	
}
