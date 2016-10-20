package sort;
/*
 * 插入法排序，由小到大
 * 思路清晰，不像我写的乱七八糟，一坨屎一样的
 */
public class Insert {
	public static void  sort(int []arr){
		int i,j;
		int data;
		for (i=1;i<arr.length;i++){
			data = arr[i];
			j=i-1;
			while(j>=0 && data <arr[j]){//一边比较，一边（比前面还要小就移动）移动数组元素，
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = data;
		}
	}

}
