package uvsq21807481;

public class UneClasseMetier {

    private final MessageLog ml;

    public UneClasseMetier(final MessageLog messageL) {
        this.ml = messageL;
    }

    public void uneMethodeMetier() {
        ml.message(": Début de uneMethodeMetier");

        //Traitements

        ml.message(": Fin de uneMethodeMetier");
    }
}
