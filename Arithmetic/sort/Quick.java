package sort;
/**
 * 程序有致命错误，值被篡改
 * @TODO 
 * @author  Myth
 * @date 2016年10月29日 下午1:10:36
 */
public class Quick {
	//快速排序：一堆的数组下标越界
	
	 void quick (int []Q,int left,int right)
	{
		int left_x=left;
		int right_x=right;
		int pivot=Q[(left+right)/2];
		while (left_x<=right_x)
		{
			for(;Q[left_x]<pivot;left_x++);//从左边开始查找
			for(;Q[right_x]>pivot && right_x>0;right_x--);//从右边开始查找
			if (left_x<=right_x)//执行交换
			{
				if (left_x!=right_x) {int temp = Q[left_x];Q[right_x]=Q[left_x];Q[right_x]=temp;}
					//SWAP(Q[left_x],Q[right_x]);//怎么实现交换
				left_x++;right_x--;	
			}
		}
		if (right_x>left)//函数的递归调用
		{
			quick(Q,left,right_x);
		}
		if (left_x<right)//函数的递归调用
		{
			quick(Q,left_x,right);
		}
	}
	void quick_all(int []Q,int data_size)//检查全局，再次递归调用
	{
		quick(Q,0,data_size-1);
	}
	public void sort(int[]arr){
		quick(arr,0,arr.length-2);          //指定位置进行排序
		quick_all(arr,arr.length-1);        //只检查一遍就够了？
	}
	/*public static void main(String [] args)
	{
		int data[7],i;
		    for (i=0;i<7;i++)
			{
				printf("输入数据");
				scanf("%d",&data[i]);
			}
		quick(data,0,6);//指定位置进行排序
		quick_all(data,7);//只检查一遍就够了？
		for (i=0;i<7;i++)
			printf ("%2d\n",data[i]);
	}
	//程序没错误，原理已经清楚了*/

}
