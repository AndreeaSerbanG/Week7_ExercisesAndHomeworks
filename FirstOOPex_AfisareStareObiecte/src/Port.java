public class Port {
    String numePort;
    String taraPort;
    String latitudinePort;
    String longitudinePort;
    int naveAncorate;
    int naveAsteptate;
    boolean avertizareMeteo;

    public void initializeState(String nume, String tara, String latitudine, String longitudine,
                                int naveExistente, int naveViitoare, boolean avertizare){
        numePort = nume;
        taraPort = tara;
        latitudinePort = latitudine;
        longitudinePort = longitudine;
        naveAncorate = naveExistente;
        naveAsteptate = naveViitoare;
        avertizareMeteo = avertizare;

    }

    public void intrareNavaInPort( int naveNouIntrate){
        naveAncorate +=naveNouIntrate;
        naveAsteptate -= naveNouIntrate;
    }

    public void iesireNavaDinPort( int naveIesite){

        naveAncorate -= naveIesite;
    }
    public void primireAvertizareMeteo( boolean avertizare){
        avertizareMeteo = avertizare;
    }
    public void printObjectState(){
        System.out.println(numePort + " este localizat in " + taraPort + ", avand coordonatele : "
                + latitudinePort + " " + longitudinePort + " \n\t Nave ancorate: " + naveAncorate
                + "\n\t Nave asteptate: " + naveAsteptate + " \n\t Avertizare meteo in vigoare: " + avertizareMeteo);
    }
}
