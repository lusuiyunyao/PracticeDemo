//��ʼһ�����ӣ�һ���»�����һ��С���ӣ�С���������º��ɳ������ӣ��Ϳ��Լ�����С���ӣ�����δ��ĳ����������
import java.util.Scanner;
import java.util.ArrayList;
public class rabit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int passMonth=sc.nextInt();
		int month=1;
		int allNum=0;
		ArrayList<Integer> rabitArr=new ArrayList<Integer>();
		int oriRabitAge=1;
		rabitArr.add(oriRabitAge);
		
		while(month<=passMonth){
			int rabitSize=rabitArr.size();//���е���������
			for(int i=0;i<rabitSize;i++){
				if(rabitArr.get(i)>=3){
					int newRabit=1;
					rabitArr.add(newRabit);
				}
				for(int j=0;j<rabitSize;j++){
					int age=rabitArr.get(j);
					age++;
					rabitArr.set(j,age);
				}
			}
			month++;
		}
		
		System.out.println("����"+rabitArr.size()+"ֻ����");
		
		
	}
}