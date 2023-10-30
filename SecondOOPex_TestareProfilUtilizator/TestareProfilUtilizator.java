public class TestareProfilUtilizator {
    public static void main(String[] args) {

        ProfilUtilizator utilizator1 = new ProfilUtilizator();
        ProfilUtilizator utilizator2 = new ProfilUtilizator();

        utilizator1.initializeazaProfil();
        utilizator1.afisareStareInterna();

        utilizator2.initializeazaProfil();
        utilizator2.afisareStareInterna();

        utilizator1.actualizareEmail("pop.ion94@gmail.com");
        utilizator1.afisareStareInterna();
        utilizator1.afisareVarsta(2022);

        utilizator2.actualizareNumarTelefon("0741 111 111");
        utilizator2.afisareStareInterna();
        utilizator2.afisareVarsta(2022);
    }
}
