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

    public static void main(String[] args)
    {
        MessageLog ml = new MessageLog();
        UneClasseMetier ucm = new UneClasseMetier(ml);
        ucm.uneMethodeMetier();
    }
}
