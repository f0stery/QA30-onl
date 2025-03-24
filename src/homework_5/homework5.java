package homework_5;

import java.util.Arrays;
import java.util.Scanner;


public class homework5 {
    public static void main(String[] args) {

        //Methods
        //get3dArray();
        //getChessboard();
        //multiMatrix();
        //sumArrayValues();
        //getDiagonalOfArray();
        sortArray();
    }

    public static Scanner input(){
        return new Scanner (System.in);
    }

    public static void get3dArray() {

        int[][][] array = new int[2][3][4];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] = (int) (Math.random() * 101);


                }
            }
        }

        for (int i = 0; i < array.length; i++){

            System.out.println("Layer: " + (i + 1) + ":");

            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[i][j].length; k++){
                    System.out.print(array[i][j][k] + "\t");
                }

                System.out.println();
            }
        }
        System.out.print(" ");

        System.out.print("Please, enter a number to increase values of array: ");
        int num = input().nextInt();

        for (int i = 0; i < array.length; i++) {

            System.out.println("New Layer: " + (i + 1) + ":");

            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + num + "\t");
                }

                System.out.println();
            }
        }
    }

    public static void getChessboard(){

        String[][] board = new String[8][8];

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if ((i + j) % 2 == 0){
                    board[i][j] = "W";
                }else{
                    board[i][j] = "B";
                }

            }
        }

        for (String[] strings : board) {
            for (String string : strings) {

                System.out.print(string + " ");
            }
            System.out.println();
        }


    }

    public static void multiMatrix(){

        int[][] matrix1 = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] matrix2 = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix2[0].length; j++){
                for (int k = 0; k < matrix1[0].length; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumArrayValues(){

        int[][] numbers = new int[][]{
                {10, 10 , 10},
                {20, 10, 20},
                {30, 50, 50}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                sum += numbers[i][j];
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array sum of values: " + sum);
    }

    public static void getDiagonalOfArray(){

        int[][] array = new int[][]{
                {1, 2, 1},
                {6, 1, 0},
                {1, 5, 1}
        };

        System.out.println("First diagonal: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.println("Second diagonal: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i][array.length - 1 - i] + " ");
        }

    }


    public static void sortArray() {

        int[][] array = {
                {5, 3, 8},
                {1, 4, 2},
                {9, 0, 7}
        };

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}