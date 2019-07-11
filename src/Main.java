import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Notre objet Scanner
        Scanner sc = new Scanner(System.in);

        //initialisation des variables
        double aConvertir, convertit=0;
        char reponse=' ';
        char mode = ' ';

        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT BY AUBIN");
        System.out.println("----------------------------------------------------------");

        do{//tant que reponse = O //boucle principale

            do{//tant que reponse n'est pas O ou N
                mode = ' ';
                System.out.println("Choisissez le mode de conversion : ");
                System.out.println("1 - Convertisseur Celsius - Fahrenheit");
                System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
                mode = sc.nextLine().charAt(0);

                if(mode != '1' && mode != '2')
                    System.out.println("Mode inconnu :/, veuillez choisir un mode existant.");

            }while (mode != '1' && mode != '2');

            //saisie de la température à convertir
            System.out.println("Temperature a convertir :");
            aConvertir = sc.nextDouble();
            sc.nextLine();

            //Selon le mode, on calcule différemment et on affiche le résultat
            if(mode == '1'){
                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                System.out.print(aConvertir + " °C correspond a : ");
                System.out.println(arrondi(convertit, 2) + " °F.");
            }
            else{
                convertit = ((aConvertir - 32) * 5) / 9;
                System.out.print(aConvertir + " °F correspond a : ");
                System.out.println(arrondi(convertit, 2) + " °C.");
            }

            //On invite l'utilisateur à recommencer ou à quitter
            do{
                System.out.println("Souhaitez-vous convertir une autre temperature ?(O/N)");
                reponse = sc.nextLine().charAt(0);

                if(reponse != 'O' && reponse != 'N')
                {
                    System.out.println("Veuillez saisir une reponse existante (O/N)");
                }

            }while(reponse != 'O' && reponse != 'N');

        }while(reponse == 'O');

        System.out.println("A bientot !");

    }

    private static double arrondi(double A, int B)
    {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

}
