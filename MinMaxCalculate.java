import java.util.Scanner;
class MinMaxCalculate
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n;
		n = sc.nextInt();
		System.out.println("Enter elements of array one by one");
		int arr[] = new int[n];
			
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt(); //Input Values
		}
		
		int min=arr[0],max=arr[0];

		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
				min = arr[i];
			
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println("Min element in the entered array is: "+ min);
		System.out.println("Max element in the entered array is: "+ max);
	}
}
