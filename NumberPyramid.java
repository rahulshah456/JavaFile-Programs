import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] Args)
    {

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter size of pyramid: ");
        a = sc.nextInt();


        int i,j,count=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }


}