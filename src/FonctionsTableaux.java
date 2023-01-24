public class FonctionsTableaux {
    public static boolean estDansTableau(char car, char[] tableau){
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] == car)
                return true;
        }
        return false;
    }
}
