public class ControlFlujo {
    public static void main(String[] args) {
        // 1. do-while: Se ejecuta al menos una vez antes de evaluar la condición
        int contador = 0;
        do {
            System.out.println("do-while: Iteración " + contador);
            contador++;
        } while (contador < 3);
        
        // 2. while: Se ejecuta mientras la condición sea verdadera
        int num = 0;
        while (num < 3) {
            System.out.println("while: Iteración " + num);
            num++;
        }
        
        // 3. for: Se repite un número determinado de veces
        for (int i = 0; i < 3; i++) {
            System.out.println("for: Iteración " + i);
        }
        
        // 4. break: Termina el bucle cuando se cumple una condición
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("break: Se detiene en la iteración " + i);
                break;
            }
            System.out.println("break: Iteración " + i);
        }
        
        // 5. continue: Omite una iteración sin salir del bucle
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("continue: Se omite la iteración " + i);
                continue;
            }
            System.out.println("continue: Iteración " + i);
        }
    }
}
