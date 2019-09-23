import junit.framework.TestCase;

public class BmiTest extends TestCase {

    /** Tester András vægt*/
    public void testBmiBeregning() {
        double resultat;
        resultat = Bmi.bmiBeregning(1.85, 95);
        assertEquals(27.8, resultat);
    }
    /** Tester maximum højde */
    public void testBmiBeregningMaximum() {
        double resultat;
        resultat = Bmi.bmiBeregning(3.01, 95);
        assertEquals(-1.0, resultat);
    }

    /** Tester minimum højde */
    public void testBmiBeregningMinimum() {
        double resultat;
        resultat = Bmi.bmiBeregning(0.001, 95);
        assertEquals(-1.0, resultat);
    }

    /** Tester 0 som højde */
    public void testBmiBeregningDivisionBy0() {
        double resultat;
        resultat = Bmi.bmiBeregning(0.0, 95);
        assertEquals(-1.0, resultat);
    }

    /** Tester maximum vægt */
    public void testBmiBeregningMaximumWeight() {
        double resultat;
        resultat = Bmi.bmiBeregning(2, 300);
        assertEquals(75.0, resultat);
    }

    /** Tester minimum vægt */
    public void testBmiBeregningMinimumWeight() {
        double resultat;
        resultat = Bmi.bmiBeregning(2, 1);
        assertEquals(0.3, resultat);
    }

    /** Tester 0 som vægt */
    public void testBmiBeregningDivisionBy0Weight() {
        double resultat;
        resultat = Bmi.bmiBeregning(2, 0);
        assertEquals(0.0, resultat);
    }

    /** Tester maximum vægt */
    public void testBmiBeregningMaximumWeightAndHeight() {
        double resultat;
        resultat = Bmi.bmiBeregning(3.01, 300);
        assertEquals(-1.0, resultat);
    }

    /** Tester minimum vægt */
    public void testBmiBeregningMinimumWeightAndHeight() {
        double resultat;
        resultat = Bmi.bmiBeregning(3.01, 1);
        assertEquals(-1.0, resultat);
    }

}