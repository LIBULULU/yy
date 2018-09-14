package WC2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.xml.internal.messaging.saaj.soap.StringDataContentHandler;

public class concretefunctions {
	static String path;
	private static InputStream flie;
	private static Pattern codelPattern;
	
	
	
	public static int getcodenum(File file) {
		int codenum = 0;
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String s;
	    while((s = br.readLine())!= null) {
	    codenum +=s.length();
	    
	}
	
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return codenum;
		}
	
	
	
	public static int getLinenum(File file) throws IOException {
		int getline = 0;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		try {
			while(br.readLine() !=null ){
				getline++;
		}
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
		return getline;
	}
	
	
	
	
	
	public static int getwordnum(File file) throws IOException {
		int wordnum = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String l=null;
			while((l=br.readLine())!=null) {
				String w ="\\d+.\\d+|\\W+";
				Pattern pattern=Pattern.compile(w);
				Matcher mat = Pattern.compile(w).matcher(l);
				while(mat.find()) {
					wordnum++;
				}
		
			}
		}catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return wordnum;
		
	}
	
	
	
	
}
	
	
	