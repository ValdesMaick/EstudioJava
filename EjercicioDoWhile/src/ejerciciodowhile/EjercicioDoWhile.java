package ejerciciodowhile;

public class EjercicioDoWhile {

    public static void main(String[] args) {
        
        int contador = 0;
        
        do {
            System.out.println("Estoy en la vulta N°: " + (contador+1));
            contador += 1;
        }while (contador < 10);
    }
    
}
