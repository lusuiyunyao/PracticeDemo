//ˮ�ɻ�  ��λ��  ��λ���ϵ������͵�������  �������
import java.util.Scanner;
import java.lang.Math;
public class daffodil{
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
		
		System.out.println("��ѯ����"+min+"��"+max+"֮���ˮ����");
		
		for(int i=min;i<=max;i++){
			int a1=i%10;
			int a2=i/10%10;
			int a3=i/100%10;
			//System.out.println(a1+","+a2+","+a3);
			double sum=Math.pow(a1,3)+Math.pow(a2,3)+Math.pow(a3,3);
			if(sum==i)
			{
				System.out.print(i+" ");
				count++;
			}
		}		
	}
}