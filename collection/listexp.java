package collection;

import java.util.*;

public class listexp {
    listexp() {
        List ls = new ArrayList();
        ls.add("ram");
        ls.add("vinay");
        ls.add("anish");
        ls.add(784);
        ls.add("rahul");
        ls.add(432.5);
        ls.add(true);
        if(ls.isEmpty()){
            System.out.println(" list khali hai ");
        }
      
        System.out.println(ls);
        System.out.println(ls.size());
    
        System.out.println("__________________N____________");

        ls.set(2,"aditya");
        ls.add(3,"ram add karo");
        
        ls.remove("vijay");
System.out.println(ls);
System.out.println(ls.size());
        
        System.out.println(ls.get(2));
        ls.clear();
        System.out.println(ls);
    }

    public static void main(String[] args) {
        listexp le = new listexp();
    }
}
