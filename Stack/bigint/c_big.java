package bigint;
import java.util.Scanner;
/*
 * �����������C�����е� ����Ŀ-200λ������� ��
 * ���ƹ������ܴ����û��쳣����������������Ժ�ѧ���쳣���������������
 * ��java����ʵ��������ܣ���ʵ�����ַ�������
 * �����������ˣ����ǳ�����
 * ʱ�䣺2015/10/02/18:14 ���������ڲŽ��������Ŀ��c��java Ҫ�����ˣ�������������
 */
public class c_big {//���еı����ǳ�Ա��Ҫ����þ�Ҫʵ��������
	public static void main(String [] args){
		String pa,pb,pd;
		int n = 0,cache,flag=0;
		char []c;
        //java���ϸ���������֣�char��int���ܿ���һ�������ƵĲ�������
		c = new char [200];//��������󣬸��������ڴ�ռ�
		Scanner ss = new Scanner(System.in);
		System.out.println("�����������ַ�����");
		pa = ss.nextLine();
		pb = ss.nextLine();
		ss.close();//�ر��������ss
		
		int index_a = pa.length()-1,index_b = pb.length()-1,index;
		//length���ʵ�ʳ��ȣ����һ����index��
		
		while (index_a!=-1 && index_b!=-1){
			cache = (int)pa.charAt(index_a)+(int)pb.charAt(index_b)-96+flag;
			flag=0;
			//charAt�ŵ����±�ֵ
			//cache���ÿһλ�ĺ�
			//charAt���ص�ֵ��Ȼ��int��
			//���ˣ� �Ƿ����ַ���,��Ϊ+�ŵ�ԭ��ǿ������ת������int
		    if (cache>=10) {
		    	cache-=10;flag=1;c[n++]=(char)(cache+48);//���������ַ���ʽ��������c��
		    }
		    else c[n++]=(char)(cache+48);
		    index_a--;index_b--;
		}
		
		if (index_a!=-1) {index=index_a;pd=pa;}
		else {index=index_b;pd=pb;}//�ܼ������ظ�����
		
		while(index!=-1){
			if ((pd.charAt(index)+flag>=58)) {
				c[n++]=(char)(pd.charAt(index)+flag-10);flag=1;
			}
			else {
				c[n++]=(char)(pd.charAt(index)+flag);flag=0;
			}
			index--;
		}
		//if(index_a==-1 && index_b==-1 && flag==0){
		if (index==-1 && flag==0){
			c[n++] = '\0';
		}
		else {
			c[n++]= '1';
			c[n++]= '\0';
		}
		int t = n-2;//Ҫ�ǵ������ַ����ǵ������е�
		while(c[t]=='0')t--;
		for (int i=t;i>=0;i--)
		System.out.print(c[i]);
	}

}
/*
if (index_a!=-1 && index_b==-1){
	while(index_a!=-1){
		if ((pa.charAt(index_a)+flag>=58)) {
			c[n++]=(char)(pa.charAt(index_a)+flag-10);flag=1;
		}
		else {
			c[n++]=(char)(pa.charAt(index_a)+flag);flag=0;
		}
		index_a--;
	}
}
//�ظ��Ĵ��밡��˵����ʲô��������һ�������������
if (index_a==-1 && index_b!=-1){
	while(index_b!=-1){
		if ((pb.charAt(index_b)+flag>=58)) {
			c[n++]=(char)(pb.charAt(index_b)+flag-10);flag=1;
		}
		else {
			c[n++]=(char)(pb.charAt(index_b)+flag);flag=0;
		}
		index_b--;
	}
}*/
//********************************************************
