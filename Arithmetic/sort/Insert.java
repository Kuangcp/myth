package sort;
/*
 * 插入法排序，由小到大
 * 
 */
public class Insert {
	public void  sort(int []arr){
		int i,j;
		int data;
		for (i=1;i<arr.length;i++){
			data = arr[i];
			j=i-1;
			while(j>=0 && data <arr[j]){//比较，如果是比前面还要小，就将数字往后移动一位。将小的那一位插入到合适位置
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = data;
		}
	}

}
