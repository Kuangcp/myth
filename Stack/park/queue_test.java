package park;
/*
 * �򵥵Ķ��е�ʵ�֣�����˼��
 */
public class queue_test {
	public static void main(String [] ars){
		int[] elem;
		int front=0,rear=0;
		elem = new int [10];
	    for  (int i=0;i<elem.length-1;i++){
	    	elem[i] = i;
	    	rear++;
	    }
	    
	    int i=0;
	    while (front != rear ){
	    	System.out.println("������"+elem[i++]);
	    	front++;
	    }
	    
	    
	}

}
