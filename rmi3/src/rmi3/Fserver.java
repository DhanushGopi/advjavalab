package RMI; import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
public class Fserver extends UnicastRemoteObject implements Facto {
    public Fserver() throws RemoteException
{
super();
}
public int fact(int x)
{
int n=x,fa=1;
for(int i=1;i<=n;i++)
{
fa=i*fa;
}
return fa;
}
public static void main(String args[])
{
try
{
Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099); 
Fserver obj=new Fserver();
r.rebind("operation",obj);
}
catch(Exception e)
{

System.out.println("error"+e);
}
}
}
