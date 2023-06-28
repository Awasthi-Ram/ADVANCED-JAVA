class cmddemo2{
public static void main(String [] args){
 int sum = 0;
for(int i =0;i<args.length;i++){
 System.out.println(args[i]);
int value = Integer.parseInt(args[i]);
 sum += value;
}
System.out.println(sum);
}
}