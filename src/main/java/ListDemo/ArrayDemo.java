package ListDemo;

import java.util.Arrays;

public class ArrayDemo {
   public static void main(String[] args) {
	
	   //1.数组转换成字符串
	  int[] arr = {11,23,42,31,44,23,44};
	  System.out.println( Arrays.toString(arr));
	  
	  //2.排序

      // 使用sort进行排序
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      
      //
      
      //方法3 parseInt()方法：将字符串参数作为有符号的十进制整数进行解析
      String s2 = "300";
      int y = Integer.parseInt(s2);
      System.out.println(y);

}
}
