package WC2;

import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.javafx.sg.prism.web.NGWebView;

public class enter {
	
	public void star() {
		System.out.println("������ָ�·��:");
		Scanner scanner = new Scanner(System.in); 
		File file = new File(scanner.nextLine());
	if(file.exists() == false) {
		System.out.println("File does not exist");
		star();
		}
	else {
		System.out.println("��ѡ���ܣ�-c -l -w");
		Scanner sc = new Scanner(System.in); 
		String str =sc.nextLine();
		switch (str) {
		case "-c":
			concretefunctions c1 =new concretefunctions();
			c1.getcodenum(file);
			System.out.println("�ַ�����"+c1.getcodenum(file));
			break;
		case "-w":
			concretefunctions c3 =new concretefunctions();
			try {
				c3.getwordnum(file);
				System.out.println("��������"+c3.getwordnum(file));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "-l":
			concretefunctions c2 =new concretefunctions();
			try {
				c2.getLinenum(file);
				System.out.println("������"+c2.getLinenum(file));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		

		default:System.out.println("��������");
		star();
			break;
		}
		
	}
}
	public void choose() {
		
	}
	
	
	
	public static void  main(String[] args) throws IOException{
		enter e1 = new enter();
			e1.star();

		}
	}
	