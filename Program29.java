public class Program29 {
    public static void main(String[] args) {
       System.out.println("String Object"); 
       String str1=new String("Suraj");
       String str2="Shubham";
       System.out.println("Str1 = "+str1);
       System.out.println("Str2 = "+str2);

       System.out.println("String buffer class");
       StringBuffer str3=new StringBuffer("Deepak");
       StringBuffer str4=new StringBuffer("Ram");
       System.out.println("Str3 = "+str3);
       str4.append("Programming");
       System.out.println("Str4.append() = "+str4);

    }
}
