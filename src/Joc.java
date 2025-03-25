import java.util.*;

public class Joc {
    private Sortides surt = new Sortides();
    private Scanner sc;
    private boolean acabat = false;
   private  Tablero tablero = new Tablero();

public Joc(){
    iniciJoc();
}
private void iniciJoc(){
    do {
        tablero.imprimirTablero();
        demanarCasellaDestapar();

    } while (!acabat);
}
private void demanarCasellaDestapar(){
    sc = new Scanner(System.in);
    surt.sortidesStrings("Ingresi Fila: ");
    int fila = sc.nextInt();
    surt.sortidesStrings("Ingresi Columna: ");
    int columna = sc.nextInt();
    tablero.destaparBarco(fila, columna);
}


}
