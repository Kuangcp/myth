package bigint;
import java.util.Scanner;
/*
 * 这个函数是由C语言中的 ”题目-200位整数求和 “
 * 完善功能是能处理用户异常输入的情况，这个等以后学了异常处理机制在来完善
 * 用java来是实现这个功能（其实就是字符操作）
 * 功能是做到了，但是程序繁琐
 * 时间：2015/10/02/18:14 用了两星期才结束这个题目，c和java 要加油了！！！！！！！
 */
public class c_big {//类中的变量是成员，要想调用就要实例化对象
	public static void main(String [] args){
		String pa,pb,pd;
		int n = 0,cache,flag=0;
		char []c;
        //java有严格的类型区分，char和int不能看成一个类型似的参与运算
		c = new char [200];//定义数组后，给他分配内存空间
		Scanner ss = new Scanner(System.in);
		System.out.println("请输入两个字符串：");
		pa = ss.nextLine();
		pb = ss.nextLine();
		ss.close();//关闭输入对象ss
		
		int index_a = pa.length()-1,index_b = pb.length()-1,index;
		//length求得实际长度，需减一放入index中
		
		while (index_a!=-1 && index_b!=-1){
			cache = (int)pa.charAt(index_a)+(int)pb.charAt(index_b)-96+flag;
			flag=0;
			//charAt放的是下标值
			//cache求得每一位的和
			//charAt返回的值竟然是int，
			//错了， 是返回字符串,因为+号的原因，强制类型转换成了int
		    if (cache>=10) {
		    	cache-=10;flag=1;c[n++]=(char)(cache+48);//将数字以字符形式存入数组c中
		    }
		    else c[n++]=(char)(cache+48);
		    index_a--;index_b--;
		}
		
		if (index_a!=-1) {index=index_a;pd=pa;}
		else {index=index_b;pd=pb;}//能简化两段重复代码
		
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
		int t = n-2;//要记得数据字符串是倒序排列的
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
//重复的代码啊，说明了什么，可以用一个函数来解决的
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
