//判断两个整数之间有多少个素数，并输出所有素数
import java.util.Scanner;
import java.lang.Math;
public class PrimeNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int min=0,max=0;
		int count=0;
		if(num1<=num2){
			min=num1;
			max=num2;
		}else{
			min=num2;
			max=num1;
		}
		
		System.out.println("查询的是"+min+"到"+max+"之间的数");
		for(int i=min;i<=max;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0) break;
			}
		System.out.print(i+",");
		count++;
		}
		System.out.println("素数共有"+count+"个");
	}
}