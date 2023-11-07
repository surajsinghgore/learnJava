public class Program30 {
    public static void main(String[] args) {
        String name="Suraj Singh";
        System.out.println("String Methods");
        System.out.println("Original String = "+name);

        System.out.println("Length is "+name.length());
        System.out.println("Name in UpperCase = "+name.toUpperCase());
        System.out.println("Name in LowerCase = "+name.toLowerCase());
        System.out.println("Length of integer 100 is "+String.valueOf(100).length());


        String second="Hello Suraj";
        System.out.println("Names are equal : "+name.equals(second));
        System.out.println("Names are equal (ignorecase): "+name.equalsIgnoreCase(second));

        System.out.println("Character at 3 is "+name.charAt(3) );
        System.out.println("Concatenated is "+name.concat(second));

        System.out.println("substring from 3 is "+name.substring(3));
        System.out.println("substring from 3 to 7 is "+name.substring(3,7));

        System.out.println("Trim "+name.trim());

        System.out.println("After replacing a with A "+name.replace('a', 'A'));

        System.out.println("Index of 'A' is "+name.indexOf('A'));
    }
}
