package cz.educanet;

import java.util.ArrayList;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findGreatestCommonDenominator(int a, int b) {
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }

        return b;
    }

    /**
     * Calculates the lowest common multiple.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 5 and 6 => 30.
     * multiples for 5: 5, 10, 15, 20, 25, *30*, 35...
     * multiples for 6: 6, 12, 18, 24, *30*...
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findLowestCommonMultiple(int a, int b) {
        int out = 0;
        int sec;
        int maximum;
        if(a > b){
            maximum = sec = a;
        }
        else{
            maximum = sec = b;
        }

        while(a!= 0) {
            if(maximum % a == 0 && maximum % b == 0) {
                out = maximum;
                break;
            }
            maximum += sec;
        }
       return out;
    }
}

