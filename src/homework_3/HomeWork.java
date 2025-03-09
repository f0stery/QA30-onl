package homework_3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){
    // Methods
        getNameSeasonIfElse();
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

}
