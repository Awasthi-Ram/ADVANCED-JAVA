class foreachex
{
public static void main(String [] args){
 
int count = 0;
int sum =  0;
for(String x:args)
{
sum += Integer.parseInt(x) ;
System.out.println(x);
count++;
}
System.out.println("no's: "+ count +" sum=  " + sum);
}

}