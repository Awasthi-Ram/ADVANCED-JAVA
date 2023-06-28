package newrev;
import java.util.Arrays;
import java.util.Scanner;
public  class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int c =7;
        String str = "   ram   awasthi  ";
        String str2 = "   ram   awasthi  ";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.charAt(7));
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("a", 7));
        System.out.println(str.lastIndexOf("a", 7));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.equals(str2));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));
        System.out.println(str.replace("r","a"));
        System.out.println(str.startsWith("ha"));
        System.out.println(str.endsWith("i"));
        System.out.println(str.contains("a"));
        System.out.println(str.substring(2));
        
// encahnced switch
switch ( str){
   // case "ram" -> {System.out.println("ram is there"); // supprt from java 14}
}
/* 
int dayOfWeek = 3;
String dayType = switch (dayOfWeek) {
    case 1, 2, 3, 4, 5 -> "Weekday";
    case 6, 7 -> "Weekend";
    default -> throw new IllegalArgumentException("Invalid day of week: " + dayOfWeek);
};
*/
System.out.println("siufhiufhSUHFSUHFS");
char[] charArray = str.toCharArray();
for (int i = 0; i < charArray.length; i++) {
    System.out.print(charArray[i] );
}
System.out.println();
System.out.println(Arrays.toString(charArray)); // Output: [H, e, l, l, o]




  
        System.out.println("hi i am here for you"+str);
    }
}
