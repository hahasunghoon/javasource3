package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputEx1 {

	public static void main(String[] args) throws IOException {
		// File 에서 내용읽기
		// text, 음악, 동영상, 이미지...
		// text : byte 기반(FileInputStream), 문자기반(FileReader)
		// 음악, 동영상, 이미지 : byte 기반
		FileInputStream fis = null;
		OutputStream out = System.out;
		
		try {
			 fis = new FileInputStream(".\\src\\io\\FileEx4.java"); // 빨간출 서치
		
//			 int data = 0;
//			 while((data=fis.read())!=-1) {
//				 System.out.print((char)data);
//				 
//			 }

			 byte[] b = new byte[100];
			 while(fis.read(b)!=-1) {
				 out.write(b);
				 
			 }
			 
	
		} catch (FileNotFoundException e) {
			//FileInputStream() => FileNotFoundException
			// fis.read() = > IOException
			e.printStackTrace();
		} finally {
			try {
				fis.close();// 빨간출 서치
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
