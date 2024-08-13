package week2;

public class fibonacci {
    public static void main(String[] args) {
        int i = 0;
        int[] myArray = {0, 1};
        while (i < 10) {
            i++;
            int sum = myArray[0] + myArray[1];
            myArray[0] = sum;
            myArray[1] += myArray[0];
            System.out.println(myArray[0]);
            System.out.println(myArray[1]);
        }
    }
}
