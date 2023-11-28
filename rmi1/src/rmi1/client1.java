package javaapplication3; 
import java.rmi.*;
import java.io.*; 
public class client1 {
public static void main(String[] args) 
{ 
    try
{
System.out.println("Reverse the String");  
rev i=(rev)Naming.lookup("test");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter String:");
String str=br.readLine(); 
String s2=i.save(str);
System.out.println("The Given string is:"+str); 
System.out.println("The Reversed String is:"+s2);

}
catch(Exception e)
{
System.out.println(e);
}
}
}
