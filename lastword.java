//����һ���ַ������������һ�����ʵĳ���
import java.util.Scanner;
public class lastword{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String input=sc.nextLine();
		
		String[] array=input.split(" ");
		int wlen=array.length;
		String lword=array[wlen-1];
		int llen=lword.length();
		System.out.println(llen);
	}
}