import java.util.Scanner;
//import java.util.Vector;


/*��Ŀ����
д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд
*/
/*public class Solution4 {
	public static int function(String str,char c)
	{
		//Vector v=new Vector();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
			}
		}
		return count;
		}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toUpperCase();
		Scanner sc1=new Scanner(System.in);
		char c1=sc1.nextLine().charAt(0);
		System.out.println(function(s,c1));
	}

}*/
public class Solution4
{
public static void main(String[] args) {
	int count=0;
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toUpperCase();
		//Scanner sc1=new Scanner(System.in);
		char c=sc.nextLine().toUpperCase().toCharArray()[0];		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}

	}



