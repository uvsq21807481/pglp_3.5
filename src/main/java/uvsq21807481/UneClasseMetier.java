package uvsq21807481;

import java.time.LocalDateTime;

public class UneClasseMetier implements Afficheur {

    public void message(String s) {
        System.out.println(LocalDateTime.now() + s);
    }

    public void uneMethodeMetier() {
        message(": Début de uneMethodeMetier");

        //Traitements

        message(": Fin de uneMethodeMetier");
    }

    public static void main(String[] args)
    {
        UneClasseMetier ucm = new UneClasseMetier();
        ucm.uneMethodeMetier();
    }
}
