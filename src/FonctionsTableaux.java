public class FonctionsTableaux {
    public static int nbOccurrences(char car, char[] tableau){
        int res = 0;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] == car)
                res++;
        }
        return res;
    }

    public static boolean estDansTableau(char car, char[] tableau){
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] == car)
                return true;
        }
        return false;
    }
}
