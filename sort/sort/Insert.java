package sort;
/*
 * ���뷨������С����
 * ˼·������������д�����߰��㣬һ��ʺһ����
 */
public class Insert {
	public static void  sort(int []arr){
		int i,j;
		int data;
		for (i=1;i<arr.length;i++){
			data = arr[i];
			j=i-1;
			while(j>=0 && data <arr[j]){//һ�߱Ƚϣ�һ�ߣ���ǰ�滹ҪС���ƶ����ƶ�����Ԫ�أ�
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = data;
		}
	}

}
