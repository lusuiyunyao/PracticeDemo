//�ж���������֮���ж��ٸ��������������������
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
		
		System.out.println("��ѯ����"+min+"��"+max+"֮�����");
		for(int i=min;i<=max;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0) break;
			}
		System.out.print(i+",");
		count++;
		}
		System.out.println("��������"+count+"��");
	}
}