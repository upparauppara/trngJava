import java.util.Scanner;
class program30
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int i=0;
while(i<5)
{
System.out.println("1:Addition");
System.out.println("2:Substraction");
System.out.println("3:Multiplication");
System.out.println("4:Divionion");
System.out.println("5:Modulus Division");
int choice=sc.nextInt();
if (choice==1)System.out.println(num1+"+"+num2+"="+(num1+num2));
if (choice==2)System.out.println(num1+"-"+num2+"="+(num1-num2));
if (choice==3)System.out.println(num1+"*"+num2+"="+(num1*num2));
 if (choice==4)System.out.println(num1+"/"+num2+"="+(num1/num2));
if (choice==5)System.out.println(num1+"%"+num2+"="+(num1%num2));
i=i+1;
}
}

}







