package uvsq21807481;

public class UneClasseMetier {

    private MessageLog ml;

    public UneClasseMetier(MessageLog messageL) {
        this.ml = messageL;
    }

    public void uneMethodeMetier() {
        ml.message(": Début de uneMethodeMetier");

        //Traitements

        ml.message(": Fin de uneMethodeMetier");
    }
}
