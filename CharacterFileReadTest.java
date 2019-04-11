import java.io.*;
class CharacterFileReadTest
{
	public static void main(String s[])throws Exception
	{
		FileInputStream fin=new FileInputStream("abc.txt");
		int size=fin.available();
		byte b[]=new byte[size];
		fin.read(b);
		String str=new String(b);
		System.out.println(str);
	}
}
