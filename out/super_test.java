public class super_test{

   
    public static void main(String[] args) {
        clt obj = new clt();
        System.out.print(obj.f);
    }
}
 class root{
        int f = 1;
    }
    class a extends root{
        int f = 2;
    }
    class b extends root{
        int f =3;
    }
    interface B {
            int fa = 5;
    }
    interface A{
        int fa = 6;
    }
    class clt  extends a  implements B{
        int f=4;
    }
