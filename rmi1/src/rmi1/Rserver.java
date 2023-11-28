package javaapplication3; 
import java.rmi.*;
import java.io.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
public class Rserver extends UnicastRemoteObject implements rev{ 
    public Rserver() throws RemoteException
{
}
public String save(String s)throws RemoteException
{
String st=new StringBuffer(s).reverse().toString(); 
System.out.println();
return(st);
}
public static void main(String args[])
{
try
{
Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099); 
Rserver s1=new Rserver();
r.rebind("test", s1); 
System.out.println("server started");
}

catch(Exception e)
{
System.out.println("Error is"+e);
}
}
}
