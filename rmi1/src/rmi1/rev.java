package javaapplication3; 
import java.rmi.*;

public interface rev extends Remote
{
public String save(String a)throws RemoteException;
}
