/* *****************************************************************************
 *  Name:              Kevin Lenell
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champ = "";
        int count = 0;
        while (!StdIn.isEmpty()) {
            String challenger = StdIn.readString();
            count++;
            if (StdRandom.bernoulli(1.0 / (double) count)) {
                champ = challenger;
            }
        }
        System.out.println(champ);
    }
}
