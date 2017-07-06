# Even
import java.io.*;
import java.util.*;
public class Even
{
public static void main(String args[])throws IoException
{
BufferedReader br=new BufferedReader(new InputSreamReader(System.in));
int n;
System.out.println("Enter the Integer Number");
n=Integer.parseInt(br.readLine());
if(n%2==0)
{
System.out.println("Entered Number is Even");
}
else
{
System.out.println("Entered Number is Odd");
}
}
}
