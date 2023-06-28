class arrayexample{


               public static void main (String args[])
             {
               int arr[] = new int[6];
               int arr2[] = {70,80,90,100};
                arr[0] = 10;
                arr[1] = 20;
                arr[2] = 30;
                arr[3] = 40;
                arr[4] =50;
                arr[5] = 60;
       
               for(int x : arr)
              {
                        System.out.println(x);
               }
               int sum = 0;
                for(int x : arr2)
              {
                     sum+=x;
                        System.out.println(x);
               }
                 
                        System.out.println(sum);
               }


}