package questionsix;

import java.util.Arrays;

public class fi {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        deleteElement(array,2);

    }

    public static void deleteElement(int[] array, int indexToDelete) {
        int[] newArray = new int[array.length - 1];
        if (indexToDelete == array.length) {
            System.out.println("invalid syntax");
        }
        if (indexToDelete < 0) {
            System.out.println("invalid syntax");
        }
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = array[i];

            }


        }
        System.out.println(Arrays.toString(newArray));
    }

    }
