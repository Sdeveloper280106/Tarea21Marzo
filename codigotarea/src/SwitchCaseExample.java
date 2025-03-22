import java.util.Scanner;

public class SwitchCaseExample {
    
    // Método que devuelve el día de la semana
    public String getDiaSemana(int dia) {
        String diaEnLetras = "";
        
        switch(dia) {  
            case 1: 
                diaEnLetras = "Domingo";
                break;
            case 2: 
                diaEnLetras = "Lunes";
                break;
            case 3: 
                diaEnLetras = "Martes";
                break;
            case 4: 
                diaEnLetras = "Miércoles";
                break;
            case 5: 
                diaEnLetras = "Jueves";
                break;
            case 6: 
                diaEnLetras = "Viernes";
                break;
            case 7: 
                diaEnLetras = "Sábado";
                break;
            default:
                diaEnLetras = "Día no válido";
        }
        return diaEnLetras;
    } 
    
    // Método que determina si el día es laboral
    public boolean getDiasNoLaborales(String dia) {
        boolean esLaboral;
        
        switch(dia.toLowerCase()) {  // Convertir todo a minúsculas para evitar problemas con mayúsculas
            case "sabado": 
            case "domingo": 
                esLaboral = false;
                break;
            case "lunes": 
            case "martes": 
            case "miercoles": 
            case "jueves": 
            case "viernes": 
                esLaboral = true;
                break;                
            default:
                esLaboral = false;
        }
        return esLaboral;
    } 
    
    // Método para realizar operaciones matemáticas
    public double realizarOperacion(double num1, double num2, char operacion) {
        double resultado = 0;
        switch(operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case '%':
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operación no válida.");
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SwitchCaseExample ejemplo = new SwitchCaseExample();
        
        // Menú de selección
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1: Obtener día de la semana");
            System.out.println("2: Verificar si es día laboral");
            System.out.println("3: Realizar operación matemática");
            System.out.println("4: Salir");
            
            int opcion = -1;
            // Validación de opción de menú
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.nextLine();  // Limpiar buffer en caso de entrada incorrecta
                continue;
            }
            
            switch (opcion) {
                case 1:
                    // Opción 1: Obtener día de la semana
                    System.out.print("Introduce un número (1-7): ");
                    int dia = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.println("El día de la semana es: " + ejemplo.getDiaSemana(dia));
                    break;
                
                case 2:
                    // Opción 2: Verificar si es día laboral
                    System.out.print("Introduce el nombre del día (Lunes, Martes, etc.): ");
                    String diaNombre = scanner.nextLine();
                    if (ejemplo.getDiasNoLaborales(diaNombre)) {
                        System.out.println(diaNombre + " es un día laboral.");
                    } else {
                        System.out.println(diaNombre + " no es un día laboral.");
                    }
                    break;
                
                case 3:
                    // Opción 3: Realizar operación matemática
                    System.out.print("Introduce el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    double num2 = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar buffer
                    System.out.print("Introduce la operación (+, -, *, /, %): ");
                    char operacion = scanner.next().charAt(0);
                    double resultado = ejemplo.realizarOperacion(num1, num2, operacion);
                    System.out.println("El resultado de la operación es: " + resultado);
                    break;
                
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}