public class Nava {
    //Starea obiectului:
    String pavilionNava;
    String numeNava;
    String tipNava;
    String portDestinatie;
    float vitezaNavigatie;
    String tipCargo;
    long tonajCargo;

    // Comportament obiectului:
    public void initializeState(String pavilion, String nume, String tip, String portDest,
                                float viteza, String tipIncarcatura, long tonajIncarcatura){
        pavilionNava = pavilion;
        numeNava = nume;
        tipNava = tip;
        portDestinatie = portDest;
        vitezaNavigatie = viteza;
        tipCargo = tipIncarcatura;
        tonajCargo = tonajIncarcatura;
    }
    public void schimbarePavilon(String pavilionNou){

        pavilionNava = pavilionNou;
    }

    public void modificareViteza( float vitezaNoua){

        vitezaNavigatie = vitezaNoua;
    }

    public void descarcareCargo( long tonajDescarcat){

        tonajCargo -= tonajDescarcat;
    }

    public void printObjectState(){
        System.out.println(tipNava +" " +  numeNava + " sub pavilion " + pavilionNava
                + " \n\t Port de destinatie: " + portDestinatie
                + " \n\t Viteza: " + vitezaNavigatie + " noduri"
                + " \n\t Incarcatura: " + tonajCargo + " tone " + tipCargo);
    }

}
