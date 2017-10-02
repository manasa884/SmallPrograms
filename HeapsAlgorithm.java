import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Manasa on 10/2/17.
 */
public class HeapsAlgorithm {

    /**
     * Applies Heap's Algorithm on a list of numbers to find all possible permutations
     * using recursion.
     * @param list input list of numbers for which we are trying to find all permutations
     * @param length length of input list
     * @param result ArrayList of permutations of the input list
     */
    public static void permutations(ArrayList<Integer> list, int length, ArrayList<ArrayList<Integer>> result) {
        if(length == 1) {
            result.add( new ArrayList<>(list));
        }
        else {
            for(int i = 0; i < length; i++) {
                permutations(list, length - 1, result);
                if(length % 2 > 0) { //Odd, swap 0 and n-1
                    Collections.swap(list, 0, length-1);
                } else { // Even, swap i and n-1
                    Collections.swap(list, i, length-1);
                }

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("Input: " + input);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        permutations(input, input.size(), result);

        System.out.println(result + "\nNumber of permutations: " + result.size());

    }
}
