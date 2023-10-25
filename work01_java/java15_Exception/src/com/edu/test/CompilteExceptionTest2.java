package com.edu.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading{
	public void readFile(String filename) throws Exception{
		FileReader reader = null;
		try {
			reader = new FileReader(filename);
			System.out.println("1. 파일을 잘 찾았습니다");
		} finally {
			reader.close();
		}
		System.out.println("3. 마지막 코드 부분입니다");
	}
}
public class CompilteExceptionTest2 {

	public static void main(String[] args){
		FileReading fr = new FileReading();
		try {
			fr.readFile("C:\\sc\\2.png");
		} catch (Exception e) {
			System.out.println("예외처리 완료");
		}
		System.out.println("readFile() calling... reading File");
	}

}
