import java.util.Scanner;
class program16
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();

int i;//variable declaration
i=0;//initialization
while(i<=num1)
{
           System.out.println((i+","));
           i=i-4;
}//whileloop
}//main()
}//program16
