import java.util.Scanner;
public class Numcheck
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
if(a>1)
{
System.out.println("positive");
}
else if(a<1)
{
System.out.println("negative");
}
else
{
System.out.println("zero");
}
}
}
