package collection;

import java.util.*;

public class setexp {
    public class Bro {
        int a = 5;
        int b = 7;
    }

    public void fun() {
        Set<Object> st = new HashSet<>();
        Bro bro = new Bro();
        st.add(7594);
        st.add("ram");
        st.add("rahul");
        st.add("mohal");
        st.add("vijay");
        st.add(bro.a);
        st.add(75.234);
        System.out.println(st);
        System.out.println(st.size());
        Scanner sc = new Scanner(System.in);
        Object ele = null;
        if(sc.hasNext()){
             ele = sc.next();
        }
        else if (sc.hasNextInt()){
             ele = sc.nextInt();
        }
        else if(sc.hasNextFloat()){
            ele = sc.nextFloat();
        }
        else{
            ele = sc.nextBoolean();
        }
        if (st.contains(ele)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        if(st.contains(bro.a)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        setexp obj = new setexp();
        obj.fun();
    }
}
