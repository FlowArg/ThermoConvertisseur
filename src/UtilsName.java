import java.util.Scanner;

class UtilsName
{
    private Scanner sc = new Scanner(System.in);
    private String nom = " ";

    void title()
    {
        System.out.println("_____________________________________________________________");
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT PAR FLOWARG");
        System.out.println("-------------------------------------------------------------");
    }

    void nom()
    {
        System.out.println("Quel est votre nom ?");
        nom = sc.nextLine();
        System.out.println("Bienvenue " + nom);
    }

    void goodbye()
    {
        System.out.println("\nA bientot " + nom);
    }

}
