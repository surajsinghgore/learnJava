public class Program34 {
    public static void main(String[] args) {
        System.out.println("Exception Handling");
        int arr[] = { 10, 10, 10 };
        int b = 0;
        try {
            int x = arr[0] / b;
            x = arr[3];
            b = Integer.parseInt("aa");
        } catch (ArithmeticException e) {
System.out.println("Division By Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Exception");
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        finally{
            System.out.println("Finally is Executed");
        }
        int y=arr[1]/10;

        System.out.println("Y = "+y);
    }
}
