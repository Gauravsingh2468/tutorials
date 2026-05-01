package basics.array;

public class basics {
// --   Declare an array of 10 integers and print all elements.
// --   Take 5 numbers as input and find their sum.
// --   Find the largest element in an array.
// --   Find the smallest element in an array.
// --   Count how many even and odd numbers are in an array.

    void printArray(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<= arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    void findSum(){
        int[] arr = {10,50,60,20,80};
        int sum = 0;
        for (int i = 0; i< arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void findlargest(){
        int[] arr= {79,56,98,88,50,80};
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void findSmallest(){
            int[] arr = {79, 56, 98, 88, 50, 80};
            int small = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < small) {
                    small = arr[i];
                }
            }

            System.out.println(small);
    }

    void countEvenOdd(){
        int[] arr = {79, 56, 98, 88, 50, 80};
        int counteven = 0;
        int countodd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                counteven++;
            }else{
                countodd++;
            }
        }
        System.out.println("Even = " + counteven+ " " + "Odd =" + countodd);
    }

    public static void main(String[] args) {
        basics bs = new basics(); bs.countEvenOdd();
    }

}
