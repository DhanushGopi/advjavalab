package javaapplication3; 
import java.rmi.*;
public class client2 {

public static void main(String args[]){ 
    try{
System.out.println("Arithmetic Operations");  
arith d=(arith)Naming.lookup("operation");
int sum=d.add(20,10); 
int sub=d.sub(20,10);

int mul=d.mul(20,10); 
int div=d.div(20,10);
System.out.println("The Addition of Two Numbers is"+sum); 
System.out.println("The Subtraction of Two Numbers is"+sub); 
System.out.println("The Multiplication of Two Numbers is"+mul); 
System.out.println("The Division of Two Numbers is"+div);
}

catch(Exception e){
}

}
}
