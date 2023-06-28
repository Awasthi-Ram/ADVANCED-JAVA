package newrev;
import java.util.*;
public class print_pattern {
    public static void main(String[] args) {
        int n = 5;
        if (n >= 1 && n <= 26) {
         
        int [] array = {11,12,13,14,15};
        for(int i =0;i<n;i++){
            
            
                System.out.println(array[(i)%5]+" "+array[(i+1)%5]+" "+array[(i+2)%5]+" "+array[(i+3)%5]+" "+array[(i+4)%5]);
            
        }
        int var1 = 21;
        int var2 = ~var1;
        System.out.println(var1+" "+var2);

        Vector obj = new Vector(4,5);
        obj.add(1);
        obj.add(1);
        obj.add(1);obj.add(1);
        obj.removeAll(obj);
        System.out.println(obj.isEmpty());
        int x,y;
        x = 10;
         x++;
         --x;
         y = x;
         System.out.println(x);
         System.out.println(y);
         try {
           int a = 0 /5;
         } catch (Exception e) {
            // TODO: handle exception
         }
         char ch = "hello".charAt(1);
         System.out.println(ch);
         String str = "i"+"like"+"java";
         System.out.println(str);
         str.equals(obj);
    }
    }
}
