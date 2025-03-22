package homework_5;

public class homework5 {
    public static void main(String[] args) {

        //Methods
        get3dArray();
    }

    public static void get3dArray() {

        int[][][] array = new int[1][3][4];

        int value = 1;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] = value++;
                }
            }
        }

        for (int i = 0; i < array.length; i++){

            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[i][j].length; k++){
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        System.out.print(" ");

    }
}
