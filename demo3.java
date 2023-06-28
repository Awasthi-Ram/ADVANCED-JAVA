class demo3{

   static void func(){
        System.out.println("staic method call");
}
 static void func2(){
   func();
    System.out.println("second function");
}
  public static void main(String [] args){
    func();

}
}