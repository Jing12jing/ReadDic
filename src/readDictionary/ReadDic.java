package readDictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDic {
	static FileReader fr;
	public static void main(String[] args) throws IOException {
		doesFileExist("D:\\QA  software\\eclipse\\Selenium\\readDic\\src\\readDictionary\\dictionary.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line=br.readLine())!=null) {
			String[] objects =line.split("-");
			String word = objects[0];
			String[] meanings=objects[1].split(",");
			System.out.println(word);
			for (String meaning: meanings) {
				System.out.println(" "+meaning);
				
			}
		}
	}
	public static void doesFileExist(String path) {
		try {
			File f = new File(path);
			fr = new FileReader(f);
			System.out.println("The file exists.");	
			
		}catch(IOException e) {
			System.out.println("The file does not exsit");
			
		}
	}
}
