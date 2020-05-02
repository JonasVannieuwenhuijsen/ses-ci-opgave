import java.util.Arrays;

public class Calculator {




    public static int bereken(int[] rij) {
        System.out.println(Arrays.toString(rij));
        return berekenFouten(rij,0,rij.length-1);
    }

    private static int berekenFouten(int[] rij, int begin, int eind) {

        int aantalFouten = 0;

        if (begin < eind){

            int midden = (begin + eind)/2;

            int[] linkseDeel = Arrays.copyOfRange(rij,begin,midden+1);
            int[] rechtseDeel = Arrays.copyOfRange(rij,midden+1,eind+1);


            aantalFouten = aantalFouten + berekenFouten(rij,begin,midden);
            aantalFouten = aantalFouten + berekenFouten(rij,midden+1,eind);
            aantalFouten = aantalFouten + berekenFoutenErtussen(rij,begin,midden,eind);
        }

        return aantalFouten;
    }

    private static int berekenFoutenErtussen(int[] rij, int begin, int midden, int eind) {

        // Maakt een array van zowel het linkse deel als van het rechtse deel
        int[] linkseDeel = Arrays.copyOfRange(rij,begin,midden+1);
        int[] rechtseDeel = Arrays.copyOfRange(rij,midden+1,eind+1);

        // Sorteert de lijsten van groot naar klein
        Arrays.sort(linkseDeel);
        Arrays.sort(rechtseDeel);

        int i = 0;
        int j = 0;
        int fout = 0;

        while( i < linkseDeel.length && j < rechtseDeel.length){
            // Als het getal in de linkse array kleiner of gelijk aan het getal van de rechtse array is,
            // is er niets aan de hand.
            if(linkseDeel[i] <= rechtseDeel[j]){
                i++;
            }
            // Anders is er een volgorde fout
            else {
                fout = fout + (linkseDeel.length - i);
                j++;
            }
        }
        return fout;
    }


    public static void main(String[] args) {
        //int [] rij = {1, 4, 9, 11, 14, 5, 8, 6, 7};
        //int [] rij = {1, 8, 2, 3, 4, 5, 6};
        int [] rij = {1, 8, 5, 6, 2, 9, 7, 3, 4};
        //int [] rij = {8, 4, 2, 1};
        int aantalVolgordeFouten = bereken(rij);
        System.out.println("Aantal volgordefouten: " + aantalVolgordeFouten);
    }
}
