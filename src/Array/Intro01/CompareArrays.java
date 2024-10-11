package Array.Intro01;

public class CompareArrays {
    /*Sammenlign to arrays. Når == bruges sammenlignes deres placering,
    ikke deres indhold. De har ikke samme placering, men fordi vi itererer gennem
    begge arrays, sammenlignes deres indhold.*/
    public static void main(String[] args) {

        String[] navne = {"Mille", "Nulle", "Buller"};
        String[] byNavne = {"Mille", "Nulle", "Bjarne"};
        boolean ens = true;

        if (navne.length == byNavne.length) {
            for (int i = 0; i < navne.length; i++) {
                if (navne[i] == byNavne[i]) {
                    ens = true;


                } else {
                    ens = false;

                }
                System.out.println(ens); //Svar: true, true, false
            }
        }


    }
}



