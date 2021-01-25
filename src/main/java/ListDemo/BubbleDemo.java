package ListDemo;

//冒泡排序
public class BubbleDemo {
	
	public static void main(String[] args) {
		
	  int[] arr = {22,44,11,33,55,88,66,77};
	  
	 bubbleSort(arr);

	  }
	
	
	
public static void bubbleSort(int arr[]) {
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr.length-1-i;j++) {
			  if(arr[j]>arr[j+1]) {
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
	  }  
	  
	// 5. 遍历输出排序后的数组
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+ " ");
				} 
}

}
