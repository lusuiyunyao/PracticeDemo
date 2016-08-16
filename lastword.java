//输入一段字符串，计算最后一个单词的长度
import java.util.Scanner;
public class lastword{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一段字符串");
		String input=sc.nextLine();
		
		String[] array=input.split(" ");
		int wlen=array.length;
		String lword=array[wlen-1];
		int llen=lword.length();
		System.out.println(llen);
	}
}