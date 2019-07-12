import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        UtilsName utils = new UtilsName();

        //énumération des variables
        double aConvertir, convertit;
        char reponse;
        char mode;

        //zeparti
        utils.title();
        do{
            utils.nom();
            do{
                System.out.println("\nChoisissez le mode de conversion : ");
                System.out.println("1 - Convertisseur Celsius - Fahrenheit");
                System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
                mode = sc.nextLine().charAt(0);

                if(mode != '1' && mode != '2')
                    System.out.println("\nMode inconnu :/, veuillez choisir un mode existant.");
            }while (mode != '1' && mode != '2');

            System.out.println("\nTemperature a convertir :");
            aConvertir = sc.nextDouble();
            sc.nextLine();

            if(mode == '1'){
                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                System.out.print(aConvertir + " °C correspond a : ");
                System.out.println(arrondi(convertit, 2) + " °F.");
            }
            else
                {    convertit = ((aConvertir - 32) * 5) / 9;
                System.out.print(aConvertir + " °F correspond a : ");
                System.out.println(arrondi(convertit, 2) + " °C.");
            }

            do{
                System.out.println("\nSouhaitez-vous convertir une autre temperature ?(O/N)");
                reponse = sc.nextLine().charAt(0);

                if(reponse != 'O' && reponse != 'N')
                {
                    System.out.println("Veuillez saisir une reponse existante (O/N)");
                }

            }while(reponse != 'O' && reponse != 'N');


        }while(reponse == 'O');

        utils.goodbye();

    }

    private static double arrondi(double A, int B)
    {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

}