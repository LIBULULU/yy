package WC2;

import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.javafx.sg.prism.web.NGWebView;

public class enter {
	public static void  main(String[] args) throws IOException{
			System.out.println("������ָ�·��");
			Scanner scanner = new Scanner(System.in); 
			File file = new File(scanner.nextLine());
		if(file.exists() == false) {
			System.out.println("File does not exist");
			return;
		}
	}
	}