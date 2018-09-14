package WC2;

import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.javafx.sg.prism.web.NGWebView;

public class enter {
	public static void  main(String[] args) throws IOException{
			System.out.println("请输入指令及路径:");
			Scanner scanner = new Scanner(System.in); 
			File file = new File(scanner.nextLine());
		if(file.exists() == false) {
			System.out.println("File does not exist");
			}
		else {
			concretefunctions c1 =new concretefunctions();
			c1.getcodenum(file);
			System.out.println("字符数："+c1.getcodenum(file));
			
			concretefunctions c2 =new concretefunctions();
			c2.getLinenum(file);
			System.out.println("行数："+c2.getLinenum(file));
			
			concretefunctions c3 =new concretefunctions();
			c3.getwordnum(file);
			System.out.println("单词数："+c3.getwordnum(file));
			
			
			
		}
		}
	}
	