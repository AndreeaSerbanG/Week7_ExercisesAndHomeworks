public class Main {
    public static void main(String[] args) {

        Nava nava1 = new Nava();
        Nava nava2 = new Nava();

        nava1.initializeState("Bulgaria", "Reya", "Petrolier",
                "Port Constanta", 11.5f, "petrol", 81349l );
        nava2.initializeState("Panama", "Zaliv", "Vrachier",
                "Port Suez", 10f, "cereale", 34520l );

        nava1.printObjectState();
        nava2.printObjectState();

        System.out.println();

        nava1.modificareViteza(0);
        nava1.descarcareCargo(25_000l);
        nava1.schimbarePavilon("Italia");
        nava1.printObjectState();

        System.out.println();

        Port port1 = new Port();
        Port port2 = new Port();

        port1.initializeState("Port Constanta", "Romania", "44.0922N",
                "28.7116E", 36, 75, false );
        port2.initializeState("Port Suez", "Egipt", "29.95N",
                "32.5391E", 48, 260, true );

        port1.printObjectState();
        port2.printObjectState();

        System.out.println();

        port1.intrareNavaInPort(1);
        port1.iesireNavaDinPort(5);
        port1.primireAvertizareMeteo(true);

        port1.printObjectState();
    }

}