package collection;
import java.util.*;
public class stackexp {
    stackexp(){
        Stack stk = new Stack<>();

        stk.push("jeans");
        stk.push("shirt");
        stk.push("watch");
        stk.push("cap");
        stk.push("shoes");

        System.out.println(stk);
        System.out.println(stk.size());

        stk.pop();
        System.out.println(stk);
        System.out.println(stk.size());
        System.out.println(stk.peek());
        System.out.println(stk);
        System.out.println(stk.size());
    }
    public static void main(String[] args) {
        stackexp obj = new stackexp();
    }
}
