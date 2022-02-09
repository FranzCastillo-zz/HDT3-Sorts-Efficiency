import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Vista implementation of the MVS design model
 */
public class Vista {
    private Scanner scan;
    public Vista(){
        scan = new Scanner(System.in);
    }

    private void prnt(String text){
        System.out.println(text);
    }
    private void separator(){
        prnt("---------------------------------------");
    }
    public void start(){
        prnt("Bienvenido al programa de ordenamientos");
        prnt("* leyendo 'data.txt' *");
    }
    public void readSuccessfully(){
        prnt("Se ha leido exitosamente!");
        separator();
    }
    public void fileNotFound(){
        prnt("Actualmente no existe 'data.txt'");
        prnt("* creando el archivo *");
        separator();
    }
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
    public void sucessfullySorted(){
        prnt("Se han aplicado los sorts! El archivo 'data.txt' esta ordenado");
    }
}
