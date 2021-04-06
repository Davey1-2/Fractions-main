package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //region: basic operations (+, -, *, /)
    /**
     * Adds the fraction to the other fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction plus(Fraction other) {
        int finder = MathUtils.findLowestCommonMultiple(denominator, other.getDenominator());

        int idk = finder/denominator;
        int idc = finder/other.getDenominator();
        int fraction = (idk * getNumerator()) + (idc * other.getNumerator());
        return new Fraction(fraction, finder);

    }

    /**
     * Subtracts other from the fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction minus(Fraction other) {
        int finder = MathUtils.findLowestCommonMultiple(denominator, other.getDenominator());

        int idk = finder/denominator;
        int idc = finder/other.getDenominator();
        int fraction = (idk * getNumerator()) - (idc * other.getNumerator());
        return new Fraction(fraction, finder);

    }

    /**
     * Multiplies the two fractions. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction times(Fraction other) {

        int denomSec = denominator * other.getDenominator();
        int numerSec = numerator * other.getNumerator();

        return new Fraction(numerSec, denomSec);
    }

    /**
     * Divides the two fractions (this / other). Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction dividedBy(Fraction other) {
        Fraction end = times(other.getReciprocal());

        return end;

    }
    //endregion

    //region: other operations
    /**
     * Gets the reciprocal (flipped) of the fraction. ie. reciprocal of 1/2 is 2/1
     * @return new fraction
     */
    public Fraction getReciprocal() {
        return new Fraction(denominator, numerator);
    }

    /**
     * Simplifies the fraction
     * @return new fraction
     */
    public Fraction simplify() {
        int finder = MathUtils.findGreatestCommonDenominator(numerator, denominator);
        int num2 = numerator/finder;
        int den2 = denominator/finder;
        return new Fraction(num2,den2);
    }

    /**
     * Calculates the floating value of the fraction.
     * @return float
     */
    public float toFloat() {
        return (float) numerator/(float) denominator;
    }
    //endregion

    //region: getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //endregion
}
