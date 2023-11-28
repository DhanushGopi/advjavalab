package RMI; 
import java.rmi.*;
public interface Facto extends java.rmi.Remote
{
public int fact(int x) throws java.rmi.RemoteException;
}
