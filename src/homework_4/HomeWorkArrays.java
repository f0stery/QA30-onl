package homework_4;

import java.util.Scanner;

public class HomeWorkArrays {
    public static void main(String[] args){

        // Methods
        //foundNumInArray();
        //randomArray();
        compareAvgValueArrays();
    }

    public static void foundNumInArray(){

        int[] nums = new int[]{1, 5, 6, 1, 10, -1};
        System.out.print("Enter number for check in array: ");

        boolean found = false;

        int numArray = input().nextInt();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == numArray) {
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Number " + numArray + " is in the array");
        } else System.out.println("Number " + numArray + " is not in the array");
    }

    public static void randomArray(){

        System.out.println("Please enter a array size: ");
        int length = input().nextInt();

        int[] randomNumbers = new int[length];

        for (int index = 0; index < randomNumbers.length; index++){
            randomNumbers[index] = (int) (Math.random() * 101);
        }

        System.out.println("Random array: ");
        for (int num: randomNumbers){
            System.out.print(num + " ");
        }
        System.out.println();

        int max = randomNumbers[0];
        int min = randomNumbers[0];
        double sum = 0;

        for (int num: randomNumbers){
            if (max < num){
                max = num;
            }
            if (min > num){
                min = num;
            }
            sum += num;
        }

        double avg = sum / length;

        System.out.println("Max array value: " + max);
        System.out.println("Min array value: " + min);
        System.out.println("Avarage array value: " + avg);
    }

    public static void compareAvgValueArrays(){

        int[] firstArray = new int[5];
        int[] secondArray = new int[5];



        for (int index = 0; index < firstArray.length; index++){
            firstArray[index] = (int) (Math.random() * 101);
        }

        for (int index = 0; index < secondArray.length; index++){
            secondArray[index] = (int) (Math.random() * 101);
        }

        System.out.println("First array: ");
        for (int num: firstArray){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Second array: ");
        for (int num: secondArray){
            System.out.print(num + " ");
        }
        System.out.println();

        double sumFirstArray = 0;
        double sumSecondArray = 0;

        for (int num: firstArray){
            sumFirstArray += num;
        }
        for (int num: secondArray){
            sumSecondArray += num;
        }

        double avgFirst = sumFirstArray / firstArray.length;
        double avgSecond = sumSecondArray / firstArray.length;

        System.out.println("Arithmetic mean first array: " + avgSecond);
        System.out.println("Arithmetic mean first array: " + avgFirst);

        if (avgFirst < avgSecond){
            System.out.println(avgSecond + " > " + avgFirst);
        } else System.out.println(avgSecond + " < " + avgFirst);
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
}
