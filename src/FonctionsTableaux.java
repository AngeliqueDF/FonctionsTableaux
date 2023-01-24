public class FonctionsTableaux {
    public static void main(String[] args) {
        char[] testTab1 = {'a','b', 'c'};
        char[] testTab2 = {'a','b', 'c', 'd', 'e','f'};
        char[] testTab3 = {'a','b', 'c', 'd','b','a','b','d'};
        System.out.println(estDansTableau('z',testTab1));
        System.out.println(nbOccurrences('a',testTab1));
        System.out.println(includesArray(testTab1, testTab2));
        System.out.println(includesArray(testTab1, testTab3));
        System.out.println(includesArray(testTab2, testTab3));
    }

    public static boolean includesArray(char[] tableau1, char[] tableau2){
        for (int i = 0; i < tableau1.length; i++) {
            for (int j = 0; j < tableau2.length; j++) {
                if(nbOccurrences(tableau1[i], tableau2) == 0){
                    return false;
                }
            }
        }
        return true;
    }

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
