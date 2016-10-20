package DiGui;

import java.util.Scanner;
/*
 * 对进栈的数据  输出所有的出栈可能  连原理都没搞懂就在这看代码，找死。。。。
 */

public class Pop {
	public static void main(String[] args) {
		    
		    int total = 0;
	        int [][] save = new int [300][];//只是给二维数组的行申请了空间，列哈没有 行就是所有情况吧，和我之前思路一样诶
	        Scanner reader = new Scanner(System.in);
	        int n = reader.nextInt();
	        int stack[] = new int [n];
	        
	        for (int i = 0; i < stack.length; i++) {
	            stack[i]=i+1;
	        }
	        
	        for (int i = 0; i < 300; i++) {
	            save[i] = new int [stack.length+1];
	        }//为数组save的列申请空间，大小是输入的大小
	        
	        InnArr(stack,save);
	        
	        System.out.println("The result is: ");
	        for (; save[total][0] != 0; total++) {
	            for (int j = 0; j < save[total].length-2; j++) {
	                System.out.print(save[total][j]+" ");
	            }
	            System.out.println(save[total][save[total].length-2]);
	        }
	        System.out.println("Total: "+total);
	    }

	    public static void InnArr(int [] stack,int [][]save){
	        int k = 1;
	        int p = 1;
	        save[0][0] = stack[0];
	        while(k<stack.length){
	            p = inset(stack,save,k,p);
	            k++;
	        }
	    }

	    public static int inset(int [] stack,int [][] save,int k,int p){//k在函数中都没有变 p永远是1那要这个变量干嘛？？？、
	        int f=p;
	        for (int i = 0; i < p; i++) {
	        	
	            for (int j = 0; j < k; j++) {//变量j就是0---k-1；范围内	取值
	                if (save[i][j]==stack[k-1]) {
	                    int temp [] = new int [save[i].length];
	                    System.arraycopy(save[i], 0, temp, 0, save[i].length);//将数组save[i]（0-length）复制到temp数组0为起始位置
	                    //就是说先把save复制一个备份给temp 再对temp操作后还给save  为什么不直接操作save呢？
	                    set(save[i] ,j+1, stack[k], temp); //     i行进行操作
	                    set(save[f], j, stack[k], temp);//      f行进行操作 f初始是等于p 
	                    f++; 
	                    for (int m = j+2; m <= k; m++) {// m 的值是2---k+1
	                        set(save[f],m,stack[k],temp);
	                        f++;
	                    }
	                    break;
	                    
	                }
	                
	            }
	        }
	        return  f;
	    }

	    public static void set(int [] save,int m,int k,int [] arr){ //实际上就是把arr数组副本一下，操作后放进save数组里
	        System.arraycopy(arr, 0, save, 0, save.length);//将arr全部复制到save上去
	        for (int i = save.length-2; i >= m; i--) {//i从倒数第二个到m循环 往后移一个位置
	            save[i+1]=save[i];
	        }
	        save[m]=k;//把形参k放在空出来的位置
	    }
	

	

}
