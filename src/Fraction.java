
    /*
    Andy Hur
    2/11/2020
     */


    /*
    I created two private variable to contain fraction denominator and numerator.
     */
    public class Fraction {
        private int denominator;
        private int numerator;




        public Fraction() {
            this(1,1);

        }


        /**
         *                                  \\//Fraction Constructor -With Parameters\\//
         *
         * This will set the users numerator and denominator to the instance variable.
         *This constructor will use the instance variables and pass it to the simplification method.
         * After that the simplified numerator and denominator are then passed to reduceFraction
         * which will find the GCD which is greatest common denominator and set the fraction to it.
         */


        public Fraction(int numerator, int denominator) {
            this.numerator=numerator;
            this.denominator=denominator;

            simplification();

            int gcd=Math.abs(gcd(this.numerator,this.denominator));

            this.numerator/=gcd;
            this.denominator/=gcd;


        }

        /**
         *                                                  \\//Simplification\\//
         *
         *This method reforms the fractions numerator and denominator to make sure that there is no negative on
         * denominator. It also inclued the negative numerator. This method is utilized to find the GCD using Euclid's formula.
         *
         */
        private void simplification() {

            if (this.denominator < 0 && this.numerator>0) {
                this.numerator *= -1;
                this.denominator = Math.abs(this.denominator);
            }

            else if (this.numerator < 0 && this.denominator < 0) {
                this.numerator = Math.abs(this.numerator);
                this.denominator = Math.abs(this.denominator);
            }


        }
        /**
         *                                                   \\//Addition\\//
         *Addition method uses the mathematical formula to fina the new fraction after completing the formula.
         * In order to use the gcd method, it needs to simplify the method to make sure that there is no negative value
         * in the denominator.

         */
        public static Fraction add(Fraction f1, Fraction f2) {

            int newFractionDenominator = f1.denominator * f2.denominator;

            int numerator1 = f1.numerator * f2.denominator;

            int numerator2 = f2.numerator * f1.denominator;

            int newFractionNumerator = numerator1 + numerator2;

            return new Fraction(newFractionNumerator, newFractionDenominator);

        }

        /**
         *                                                 \\//Subtraction\\//
         *Subtraction method utilize the mathematical formula in order to find the new fraction after the completing the
         * formula.
         * In order to use the gcd method, it needs to me simplified the method to make sure that there is no negative
         * value on the denominator.
         */

        public static Fraction subtract(Fraction f1, Fraction f2) {

            int numerator1 = f1.numerator * f2.denominator;

            int numerator2 = f2.numerator * f1.denominator;

            int newFractionNumerator = numerator1 - numerator2;

            int newFractionDenominator = f1.denominator * f2.denominator;


            return new Fraction(newFractionNumerator, newFractionDenominator);
        }

        /**
         *                                                  \\//Multiply\\//
         *It uses the fraction multiplication to find the new fraction after completing the formula.
         * In order to use the gcd method, it needs to me simplified the method to make sure that there is no negative
         *value on the denominator.

         */

        public static Fraction multiply(Fraction f1, Fraction f2) {

            int newFractionNumerator = f1.numerator *f2.numerator ;

            int newFractionDenominator = f1.denominator * f2.denominator;


            return new Fraction(newFractionNumerator, newFractionDenominator);
        }

        /**
         *                                                  \\//Divide\\//
         *
         *It uses the fraction division to find the new fraction after completing the formula.
         *In order to use the gcd method, it needs to me simplified the method to make sure that there is no negative
         *value on the denominator.
         */
        public static Fraction divide(Fraction f1, Fraction f2) {


            int f2ReciprocalNumerator= f2.denominator;
            int f2ReciprocalDenominator= f2.numerator;

            int newFractionNumerator = f1.numerator * f2ReciprocalNumerator;

            int newFractionDenominator = f1.denominator * f2ReciprocalDenominator;


            return new Fraction(newFractionNumerator, newFractionDenominator);
        }

        /**
         *                                                  \\//ReduceFraction\\//
         *
         *Reduces the fraction(numerator and denominator) passed to method. The Reduce Fraction method is based on
         * Euclid’s Algorithm.
         */


        private int gcd(int m, int n) {
            while (m % n != 0) {
                int oldm = m;
                int oldn = n;

                m = oldn;
                n = oldm % oldn;
            }
            return n;
        }

        /**
         *                                                  \\//toString\\///
         *
         * toString is a built in java method that  returns a string representing the object.
         *
         * @return returns the numerator and denominator as a string.
         */

        public String toString() {
            return numerator +"/"+denominator;
        }

    }

