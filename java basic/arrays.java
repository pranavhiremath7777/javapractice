public class arrays{
    public static void main (String args[]){
        int [] arr=new int[5];

        //different types of arrays
        float [] arr2=new float[5];
        char [] arr3=new char[5];
        String [] arr4={"pranav","sachin","rahul", "rohit","saurabh"};
        //int [] arr=new int[5]; this is how we declare an array in java
        //initialize the array
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //arr[5]=60; error out of index

        //int [] arr2={10,20,30,40,50}; declaring + initializing an array in one line

       /* 
       System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr.length);
        */ 

        //array using for loop
        System.out.println("Array using for loop");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //array in reverse order
        System.out.println("Array in reverse order");
        for(int i=arr.length -1;i>=0;i--){
            System.out.println(arr[i]);
        }

        //array using for each loop
        System.out.println("Array using for each loop");
        for(int element:arr){
            System.out.println(element);
        }

    }

}