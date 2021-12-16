package lesson_02;

public class SrtPool {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "cat";

        String str3 = new String("Cat");
        str3 = str3.toLowerCase().intern();
//       str3 = str3.toLowerCase();

        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true


    }
}
