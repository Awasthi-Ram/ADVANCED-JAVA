package collection;
import java.util.*;
public class setexp2 {
    setexp2(){
        Set st = new HashSet();

        st.add("ram");
        st.add("mohal");
        st.add("umendra");
        st.add("vijay");

        System.out.println(st);
        System.out.println("none " + st.size());
        
        System.out.println(" enter element you need to find");

        Scanner sc = new Scanner(System.in);
        String ele = sc.next();
        
        if(st.contains(ele)){
            System.out.println("found");

        }
        else{
            System.out.println("not found");
        }
    }
    public static void main(String[] args) {
        setexp2 obj = new setexp2();

    }
}
