class cmddemo{
public static void main(String[] args){
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
int z = x +y;
  // System.out.println("sum " + z);
//System.out.println(args[1]);
//System.out.println(args[2]);
//System.out.println(args[3]);

for(int i = 0 ;i<4;i++){
System.out.println(args[i]);

} 
System.out.println("size " +args.length);
 
for(int i = 0 ;i<args.length;i++){
System.out.println(args[i]);

} 
}
}
