package questionfour;

import java.util.Arrays;

public class questionfour {
    public class bubble {
        public static void main(String[] args) {
            int[] numbers= {1,2,9,6,7,};
            bubblesort(numbers);
            System.out.println(Arrays.toString(numbers));
            //System.out.println;
        }
        static int bubblesort(int[] bubble){
            for (int i = bubble.length-1; i >0 ; i--) {
                for (int j = 0; j < i; j++) {
                    if (bubble[j] >bubble[j+1]){
                        int temp = bubble[j];
                        bubble[j] =bubble[j+1];
                        bubble[j+1]= temp;
                    }

                }

            }

            return 0;
        }
    }

    }


