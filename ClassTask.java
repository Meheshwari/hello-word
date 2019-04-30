import java.util.Scanner;
class ClassTask
{
 public static void main(String args[])
{
 Scanner sc =new Scanner(System.in);
 System.out.print("enter table=");
 int tab =sc.nextInt();
 System.out.print("enter STARTING POINT=");
 int sp=sc.nextInt();
 System.out.print("enter end point= ");
 int ep= sc.nextInt();
 int result;
 for(int i=sp; i<= ep; i++)
{
 result=tab*i;
System.out.println(tab+ "x" + i+ "="+result);
}
 }
 }
