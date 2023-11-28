package RMI;
import java.rmi.*; 
public class client4 {
public static void main(String args[])
{
try
{
System.out.println("Factorial"); 
Facto f=(Facto)Naming.lookup("//localhost/operation");
int facto=f.fact(5);
System.out.println("Factorial:"+facto);
}
catch(Exception e)
{
System.out.println("Error is"+e);
}

}
}
