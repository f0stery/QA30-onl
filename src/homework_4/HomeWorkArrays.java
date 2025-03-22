package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkArrays {
    public static void main(String[] args){

        // Methods
        //foundNumInArray();
        //deleteNumInArray();
        //getMaxMinMidValues();
        //compareAvgValueArrays();
        //getArrayEvenValues();
        //setZeroNotEvenIndexValues();
        //sortArrayWithNames();
        bumbleSort();
    }

    public static void foundNumInArray(){

        int[] nums = new int[]{1, 5, 6, 1, 10, -1};
        System.out.print("Enter number for check in array: ");

        boolean found = false;

        int numArray = input().nextInt();

        for (int num : nums) {
            if (num == numArray) {
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Number " + numArray + " is in the array");
        } else System.out.println("Number " + numArray + " is not in the array");
    }

    public static void deleteNumInArray(){

        int[] numbers = new int[]{1, 8, 9, 10, 1, 2};

        System.out.print("Array: ");
        showArray(numbers);
        System.out.println();
        System.out.print("Please, enter the number for delete him in array: ");
        int checkNum = input().nextInt();

        int counter = 0;

        for (int number : numbers) {
            if (number == checkNum) {
                counter += 1;
            }
        }

        if (counter == 0){
            System.out.println("We couldn't find any matches in the array. There is no need for changes.");
            showArray(numbers);
        } else {
            if (counter < numbers.length){
                int[] newArray = new int[numbers.length - counter];

                for (int index = 0, newIndex = 0; index < numbers.length; index++){
                    if (numbers[index] != checkNum){
                        newArray[newIndex] = numbers[index];
                        newIndex++;
                    }
                }
                System.out.println("New Array: ");
                showArray(newArray);
            }
        }

    }

    public static void getMaxMinMidValues(){

        System.out.println("Please enter a array size: ");
        int length = input().nextInt();

        int[] randomNumbers = new int[length];

        for (int index = 0; index < randomNumbers.length; index++){
            randomNumbers[index] = (int) (Math.random() * 101);
        }

        System.out.println("Random array: ");

        showArray(randomNumbers);

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
        showArray(firstArray);
        System.out.println();

        System.out.println("Second array: ");
        showArray(secondArray);
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

    // additional tasks

    public static void getArrayEvenValues() {

        Scanner scanner = input();
        int sizeArray;

        while (true) {
            System.out.print("Please, enter a size for create array (6 - 10): ");
            sizeArray = scanner.nextInt();

            if (sizeArray <= 10 && sizeArray > 5) {
                break;
            } else {
                System.out.println("Incorrect size. Please enter correct size (6-10): ");
            }
        }

        int[] randomArray = new int[sizeArray];


        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = (int) (Math.random() * 101);
        }
        System.out.println("Array:");
        showArray(randomArray);

        int counter = 0;
        for (int j : randomArray) {
            if (j % 2 == 0 && j != 0) {
                counter += 1;
            }
        }
        int[] evenValues = new int[counter];
        int newIndex = 0;

        for (int i : randomArray) {
            if (i % 2 == 0 && i != 0) {
                evenValues[newIndex] = i;
                newIndex++;
            }
        }

        System.out.println();
        System.out.println("New array:");
        showArray(evenValues);
    }

    public static void setZeroNotEvenIndexValues(){

        System.out.print("Please, enter array size: ");
        int size = input().nextInt();

        int[] array = new int[size];

        for (int index = 0; index < array.length; index++){
            array[index] = (int) (Math.random() * 101);
        }

        System.out.println("Original array: ");
        showArray(array);


        for (int index = 1; index < array.length; index += 2){
            array[index] = 0;
        }
        System.out.println("New array: ");
        showArray(array);

        System.out.println();
    }

    public static void sortArrayWithNames(){
        String[] names = new String[] {
                "Evgeny", "Tatiana", "Svetlana",
                "Alex", "Elizabet", "Daria",
                "Gennadiy", "Stanislav", "Vadim"
        };
        Arrays.sort(names);

        System.out.println("Sorted array:\n" + Arrays.toString(names));
    }

    public static void bumbleSort(){

        int[] num = new int[] {2, 3, 4, 1, 10, 2, 4, 44, 22, 100};
        boolean swapped;

        System.out.println("Original array: ");
        showArray(num);

        for (int i = 0; i < num.length - 1; i++){
            swapped = false;

            for (int j = 0; j < num.length - 1; j++){
                if (num[j] > num[j + 1]){
                    int number = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = number;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Sorted array: ");
        showArray(num);
    }

    public static void showArray(int[] numbers){
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
}
