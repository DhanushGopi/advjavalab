package javaapplication3; 
import java.rmi.*;
public interface arith extends java.rmi.Remote{

public int add(int x,int y)throws java.rmi.RemoteException; 
public int sub(int x,int y)throws java.rmi.RemoteException; 
public int mul(int x,int y)throws java.rmi.RemoteException;
public int div(int x,int y)throws java.rmi.RemoteException;
}
