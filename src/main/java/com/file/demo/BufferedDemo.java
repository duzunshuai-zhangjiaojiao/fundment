package com.file.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\jenkins.war");
		FileOutputStream fos = new FileOutputStream("copy.war");
		
		//创建缓冲区，对输入流进行包装
		BufferedInputStream bis = new BufferedInputStream(fis);
				//创建缓冲区，对输出流进行包装
	   BufferedOutputStream bos = new BufferedOutputStream(fos);

	   int b;
		while ( (b = bis.read()) != -1) {
			bos.write(b);
		}
		//关闭输入流缓冲区
		bis.close();
		//关闭输出流缓存区
		bos.close();

	}

}
