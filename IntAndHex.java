//javaʮ��������ʮ����֮���໥ת��
/*
��������˽�������
ʮ���ơ����������ƣ�Integer.toBinaryString(n);
ʮ���ơ������˽��ƣ�Integer.toOctalString(n);
*/
import java.util.Scanner;


public class IntAndHex {
	public static void main(String[] args) {
		
		boolean flag=false;
		try {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			String oriNum=sc.next().toLowerCase();
			String reg1="(0x|0X)([0-9a-f]{1,8})";
			String reg2="[0-9]+";
			String result;
			
			//�����ʮ��������������0x��0X��ͷ��ȡֵ��ΧΪ2^32
			//ʮ������ת��Ϊʮ������
			if(a==16&&b==10&&oriNum.matches(reg1)) {
				String hexNum=oriNum.substring(2);
				//result=Integer.valueOf(hexNum,16).toString();//����1
				result=hexToInt(hexNum);//����2
				System.out.println("ʮ������תʮ������Ϊ��"+result);
				flag=true;
			}
			
			//ʮ����ת��Ϊʮ��������
			if(a==10&&b==16&&oriNum.matches(reg2)){
				//result=Integer.toHexString(Integer.valueOf(oriNum));//����1
				result=intToHex(oriNum);//����2
				System.out.println("ʮ����תΪʮ������: "+"0x"+result);
				flag=true;
			}

		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		finally {
			if(flag==false) {
				System.out.println("������ĸ�ʽ����");
			}
		}

	}
	//ʮ�����ơ�����ʮ����  ����2
	protected static String hexToInt(String str) {
		int sum=0;
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			int chnum=0;
			if(ch>='0'&&ch<='9')  chnum=(int)(ch-'0');
			if(ch>='a'&&ch<='f')  chnum=(int)(ch-'a'+10);
			sum+=chnum*Math.pow(16,str.length()-1-i);
		}
		String sums=Integer.toString(sum);
		return sums;
	}
	
	//ʮ���ơ�����ʮ������  ����2
	protected static String intToHex(String str){
		char[] ch={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		char[] chResult=new char[8];
		int num=Integer.valueOf(str);
		int pos=chResult.length-1;
		while(num!=0){
			int temp=num&15;
			System.out.println(temp);
			chResult[pos--]=ch[temp];
			num=num>>>4;
		}
		String result=String.valueOf(chResult).trim();
		return result;
		
	}

}