import java.util.Scanner;
 
 
public class ejemploSwitch{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la operación");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        
        int opcion = scanner.nextInt();

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 + num2;;
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
        
        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}