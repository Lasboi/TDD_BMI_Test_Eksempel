public class Bmi {


    /** Denne metode returnerer BMI for indtastet højde og vægt
     *  -- Vægt skal være i kg
     *  -- Højde skal være i meter
     *  -- Hvis ugyldige parametre indtastes, så vil denne metode returne -1
     */
    static double bmiBeregning(double hojde, double vaegt) {

        final double MIN_HOJDE = 0.01;
        final double MAX_HOJDE = 3.0;

        // Resultat med mange decimaler
        double resultat = vaegt / Math.pow(hojde, 2);
        // Vi runder resultatet ned til 2 decimaler (tak, Emil)
        resultat = Math.round(resultat*10.0)/10.0;

        if (hojde>MAX_HOJDE || hojde<MIN_HOJDE ) {
            return -1;
        }

        return resultat;
    }

}
