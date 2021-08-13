// project 12 Lottery Number Generator
/*
    1- input 6 numbers between 1 and 49
    2- after drawing a number check to see if it is repeated
    3- if repeated loop the draw until not repeated
    4- sort the numbers using the Arrays.sort method
 */
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random rando = new Random();
        int min = 1;
        int max = 49;
        int slots = 6;

        // all elements initialized to 0
        int[] lotteryArray = new int[slots];
        boolean isRepeated;
        int randomNumber = 0;

        for (int indexNumDrawn = 0; indexNumDrawn < slots; indexNumDrawn++) {
            do {
                isRepeated = false;
                // this will return a value between 1 - 49
                randomNumber = rando.nextInt(max + 1 - min) + min;
                // check for repeated number against filled non-zero elements
            for (int i = 0; i <= indexNumDrawn; i++) {
                // check against filled non-zero elements
                if (lotteryArray[i] == randomNumber) {
                    isRepeated = true;
                    break;
                }
            }
            } while (isRepeated);
            lotteryArray[indexNumDrawn] = randomNumber;
        }

        Arrays.sort(lotteryArray);
        System.out.println("the results of the Lottery are:");
        for (int i = 0; i < slots; i++) {
            System.out.print(lotteryArray[i] + " ");
        }
    }
}
