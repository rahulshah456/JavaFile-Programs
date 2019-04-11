import java.util.Scanner;
class CountWords
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string");
		s = sc.nextLine();
		//System.out.println(s);
		int count=1;
		char c[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c[i]==' ')
				count++;
		}
		System.out.println("Number of words in the given statement is: "+count);
	}
}
