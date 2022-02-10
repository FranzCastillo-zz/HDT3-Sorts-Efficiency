import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Vista implementation of the MVS design model
 */
public class Vista {
    private Scanner scan;

    /**
     * Constructor for the Vista class. Declares a new Scanner instance
     */
    public Vista(){
        scan = new Scanner(System.in);
    }

    /**
     * Prints on to the console
     * @param text The text to be printed
     */
    private void prnt(String text){
        System.out.println(text);
    }

    /**
     * Shows a separator in the console made by dashes
     */
    private void separator(){
        prnt("---------------------------------------");
    }

    /**
     * It shows a welcome message in the console
     */
    public void start(){
        prnt("Bienvenido al programa de ordenamientos");
        prnt("* leyendo 'data.txt' *");
    }

    /**
     * Shows that the file was successfully read
     */
    public void readSuccessfully(){
        prnt("Se ha leido exitosamente!");
        separator();
    }

    /**
     * Shows in the console that the file 'data.txt' is missing
     */
    public void fileNotFound(){
        prnt("Actualmente no existe 'data.txt'");
        prnt("* creando el archivo *");
        separator();
    }

    /**
     * Asks for a user input of a integer number
     * @param lowerLimit the lower number that the user may input
     * @param upperLimit the highest number that the user may input
     * @return the user input
     */
    public int askInt(int lowerLimit, int upperLimit){
        separator();
        prnt("Ingrese la cantidad de datos que desea generar:");
        while(true){
            try{
                int option = scan.nextInt();
                scan.nextLine();
                if(option >= lowerLimit && option <= upperLimit){
                    return option;
                }else{
                    throw new InputMismatchException();
                }
            }catch(InputMismatchException e){
                scan.next();
                prnt("No ha ingresado un numero valido");
            }
        }
    }

    /**
     * Shows on the console that the file was successfully sorted
     */
    public void successfullySorted(){
        prnt("Se han aplicado los sorts! El archivo 'data.txt' esta ordenado");
    }

    /**
     * Shows the execution time of the sort
     * @param time the time that the sort took
     */
    public void showExecutionTime(long time){
        prnt("El sort ha tardado: " + time + " ms");
    }
}
