package ntu.selab.phrase.suffixtree.test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import ntu.selab.phrase.suffixtree.Scanner;

import org.junit.Test;

public class testConstructTable {

	@Test
	public void test() {
		Scanner sc = new Scanner();
		File file = new File("doc1.txt");
		try{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while((line=br.readLine()) != null){
			//sc.scan(line);
			sc.scanToMix(line, 3);
		}
		sc.printM();
		br.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
