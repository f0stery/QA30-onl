package homework_3;

import java.util.Scanner;


public class HomeWork {
    public static void main(String[] args){
    // Methods
        getMultiplicationTable();
    }

    public static void getNameSeasonSwitch(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the month number to find out the season: ");

        int month = input.nextInt();

        switch (month) {
            case 1, 2, 12:
                System.out.println("It's Winter!");
                break;
            case 3, 4, 5:
                System.out.println("It's Spring!");
                break;
            case 6, 7, 8:
                System.out.println("It's Summer!");
                break;
            case 9, 10, 11:
                System.out.println("It's Fall!");
                break;
            default:
                System.out.println("There is no such month in a year");
        }
    }

    public static void getNameSeasonIfElse(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the month number to find out the season: ");

        int month = input.nextInt();

        if (month <= 2 && month > 0 || month == 12){
            System.out.println("It's Winter!");
        } else if (month <= 5 && month >= 3){
            System.out.println("It's Spring!");
        } else if (month <= 8 && month >= 6){
            System.out.println("It's Summer!");
        } else if (month <= 11 && month >= 9){
            System.out.println("It's Fall!");
        } else {
            System.out.println("There is no such month in a year");
        }
    }

    public static void checkParity(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to check its parity: ");

        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " - even number");
        } else {
            System.out.println(number + " - not even number");
        }
    }

    public static void getWeather(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение температуры: ");

        int number = input.nextInt();

        if (number > -5){
            System.out.println("Тепло");
        } else if (number > -20){
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
    public static void getColorRainbow(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a number to get color of Rainbow: ");

        int number = input.nextInt();

        switch (number){
            case 1:
                System.out.println(number + " - Red color!");
                break;
            case 2:
                System.out.println(number + " - Orange color!");
                break;
            case 3:
                System.out.println(number + " - Yellow color!");
                break;
            case 4:
                System.out.println(number + " - Green color!");
                break;
            case 5:
                System.out.println(number + " - Blue color!");
                break;
            case 6:
                System.out.println(number + " - Indigo color!");
                break;
            case 7:
                System.out.println(number + " - Violet color!");
                break;
            default:
                System.out.println("Out of colors");
        }
    }

    public static void getNotEvenNumbers(){
        for (int num = 1; num <= 99; num++){
            if (num % 2 == 0){
                continue;
            }
            System.out.print(" " + num);
        }
    }

    public static void getNumberDecrement(){
        for (int num = 5; num >= 1; num--){
            System.out.print(" " + num);
        }
    }

    public static void getSumOfNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter positive number for get sum of numbers: ");

        int number = input.nextInt();
        int sum = 0;

        for (int num = 1; num <= number; num++){
            sum += num;
            System.out.print(num + " ");
        }

        System.out.println("Sum of numbers = " + sum);
    }

    public static void getSequenceNumbers(){

        int num = 0;

        while (num + 7 <= 100){
            num += 7;
            System.out.print(num + " ");
        }
    }

    public static void getNegativeSequenceNumbers(){

        int num = 0;
        int count = 0;

        while (count < 10){
            System.out.print(num + " ");
            num -= 5;
            count += 1;
        }
    }

    public static void getSquareNumbers(){

        for (int num = 10; num <= 20; num++){
            System.out.print(num * num + " ");
        }
    }

    public static void getSequenceFibonacci(){

        int numfirst = 0;
        int numsecond = 1;

        for (int num = 0; num < 11; num++){
            System.out.print(numfirst + " ");
            int numnext = numfirst + numsecond;
            numfirst = numsecond;
            numsecond = numnext;
        }
    }

    public static void getSumPercent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the amount you want to invest: ");

        float sum = input.nextFloat();

        System.out.print("Please, enter for how many months: ");

        int months = input.nextInt();
        float finalSum = sum;
        float monthRate = 0.07f;

        if (months <= 12 && months != 0){
            for (int num = 0; num < months; num++){
                finalSum += finalSum * monthRate;
            }
            System.out.println("Your sum for " + months + " months = " + finalSum);
        } else {
            System.out.println("Please enter a valid number of months (1-12)");
        }
    }

    public static void getMultiplicationTable(){

        int result = 1;

        for (int num = 1; num <= 10; num++){
            for (int multiplicat = 1; multiplicat <= 10; multiplicat++){
                result = num * multiplicat;
                System.out.println(num + " * " + multiplicat + " = " + result);
            }
        }
    }
}