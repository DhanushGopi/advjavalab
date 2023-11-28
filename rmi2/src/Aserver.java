package javaapplication3; 
import java.io.*;
import java.rmi.*; 
import java.rmi.server.*;
import java.rmi.registry.Registry;

public class Aserver extends UnicastRemoteObject implements arith{ 
    public Aserver()throws RemoteException{
super();
}
public int add(int x,int y){
    return (x+y);
}
public int sub(int x,int y){ 
    return (x-y);
}
public int mul(int x,int y){ 
    return (x*y);
}
public int div(int x,int y){

return (x/y);
}
public static void main(String args[]){ 
    try{
Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
Aserver obj=new Aserver();
Naming.rebind("operation",obj); 
System.out.println("server started");
}
catch(Exception e){ 
    System.out.println("Error is"+e);
}
}
}
