import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {
         System.out.println("Hola Pedro");
    
        System.out.print("Como va todo");
        System.out.print(10);
        System.out.print(10.2);
        System.out.print('A');
    
        System.out.printf("Aqui va una cadena %s%n", "Pedro");
        System.out.printf("Aqui va una cadena %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Pedro Ospina",10);
    

        var scanner = new Scanner(System.in);
        
        System.out.print("Por favor ingrese su nombre: ");
        var entero = scanner.nextLine();

        System.out.println(entero);
        scanner.close();

        }
}