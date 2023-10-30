import java.util.Scanner;

public class ProfilUtilizator {
    String nume;
    String prenume;
    String email;
    String numarDeTelefon;
    String dataNasterii;
    String gen;

    int anulNasterii;


    public void initializeazaProfil(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti numele utilizatorului: ");
        nume = sc.next();

        System.out.print("Introduceti prenumele utilizatorului: ");
        prenume = sc.next();

        sc.nextLine();

        System.out.print("Introduceti adresa de email a utilizatorului: ");
        email = sc.nextLine();

        System.out.print("Introduceti numarul de telefon al utilizatorului: ");
        numarDeTelefon = sc.nextLine();


        System.out.print("Introduceti ziua nasterii utilizatorului: ");
        int ziuaNasterii;
        ziuaNasterii = sc.nextInt();

        System.out.print("Introduceti luna nasterii utilizatorului: ");
        int lunaNasterii;
        lunaNasterii = sc.nextInt();

        System.out.print("Introduceti anul nasterii utilizatorului: ");
        anulNasterii= sc.nextInt();

        dataNasterii = ziuaNasterii + "." + lunaNasterii + "." + anulNasterii;

        System.out.print("Introduceti genul utilizatorului: ");
        gen = sc.next();


    }
    public void actualizareEmail(String emailNou){
        email = emailNou;
    }
    public void actualizareNumarTelefon( String numarNou){
        numarDeTelefon = numarNou;
    }
    public void afisareVarsta(int an){
        int varsta = an - anulNasterii;
        System.out.println(" Varsta utilizatorului " + nume + " " + prenume+ " este de: " + varsta);
    }
    public void afisareStareInterna(){
        System.out.println("Utilizator " + nume + " " + prenume +
                "\n\tEmail: " + email + "\n\tNumar de telefon: " + numarDeTelefon +
                "\n\tData nastere: " + dataNasterii + "\n\tGen: " + gen);
    }
}
