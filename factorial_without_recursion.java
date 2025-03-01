import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n,i,fact=1;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=a.nextInt();
        a.close();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
    System.out.println(fact);
    }
}
