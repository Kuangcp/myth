package DiGui;

import java.util.Scanner;
/*
 * �Խ�ջ������  ������еĳ�ջ����  ��ԭ��û�㶮�����⿴���룬������������
 */

public class Pop {
	public static void main(String[] args) {
		    
		    int total = 0;
	        int [][] save = new int [300][];//ֻ�Ǹ���ά������������˿ռ䣬�й�û�� �о�����������ɣ�����֮ǰ˼·һ����
	        Scanner reader = new Scanner(System.in);
	        int n = reader.nextInt();
	        int stack[] = new int [n];
	        
	        for (int i = 0; i < stack.length; i++) {
	            stack[i]=i+1;
	        }
	        
	        for (int i = 0; i < 300; i++) {
	            save[i] = new int [stack.length+1];
	        }//Ϊ����save��������ռ䣬��С������Ĵ�С
	        
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

	    public static int inset(int [] stack,int [][] save,int k,int p){//k�ں����ж�û�б� p��Զ��1��Ҫ����������������
	        int f=p;
	        for (int i = 0; i < p; i++) {
	        	
	            for (int j = 0; j < k; j++) {//����j����0---k-1����Χ��	ȡֵ
	                if (save[i][j]==stack[k-1]) {
	                    int temp [] = new int [save[i].length];
	                    System.arraycopy(save[i], 0, temp, 0, save[i].length);//������save[i]��0-length�����Ƶ�temp����0Ϊ��ʼλ��
	                    //����˵�Ȱ�save����һ�����ݸ�temp �ٶ�temp�����󻹸�save  Ϊʲô��ֱ�Ӳ���save�أ�
	                    set(save[i] ,j+1, stack[k], temp); //     i�н��в���
	                    set(save[f], j, stack[k], temp);//      f�н��в��� f��ʼ�ǵ���p 
	                    f++; 
	                    for (int m = j+2; m <= k; m++) {// m ��ֵ��2---k+1
	                        set(save[f],m,stack[k],temp);
	                        f++;
	                    }
	                    break;
	                    
	                }
	                
	            }
	        }
	        return  f;
	    }

	    public static void set(int [] save,int m,int k,int [] arr){ //ʵ���Ͼ��ǰ�arr���鸱��һ�£�������Ž�save������
	        System.arraycopy(arr, 0, save, 0, save.length);//��arrȫ�����Ƶ�save��ȥ
	        for (int i = save.length-2; i >= m; i--) {//i�ӵ����ڶ�����mѭ�� ������һ��λ��
	            save[i+1]=save[i];
	        }
	        save[m]=k;//���β�k���ڿճ�����λ��
	    }
	

	

}
