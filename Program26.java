import java.io.*;
import java.util.Scanner;

public class Program26 {
public static void main(String[] args) throws IOException {
    

    System.out.println("Stream In Java");
    System.out.println("Standard Input Stream");
    System.out.println("InputStreamReader and BufferReader ");
    InputStreamReader isr1=new InputStreamReader(System.in);
    BufferedReader br1=new BufferedReader(isr1);

    System.out.println("Buffer Reader ");
    String str1,str2,str3;
    System.out.print("Enter String 1 = ");
    str1=br1.readLine();

System.out.println("Scanner Class");
System.out.print("Enter String 2 = ");
Scanner sc=new Scanner(System.in);
str2=sc.next();


System.out.println("DataInputStream and DataOutputStream");
DataInputStream dis=new DataInputStream(System.in);
System.out.print("Enter String 3 = ");
str3=dis.readLine();


System.out.println("Standard Output Stream");

    System.out.println("Str1 = "+str1);
    System.out.println("Str2 = "+str2);
    System.out.print("Str3 = "+str3);



}
    
}