//初始一对兔子，一个月会生出一对小兔子，小兔子三个月后变成成年兔子，就可以继续生小兔子，计算未来某月兔子总数
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
			int rabitSize=rabitArr.size();//已有的兔子数量
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
		
		System.out.println("共有"+rabitArr.size()+"只兔子");
		
		
	}
}