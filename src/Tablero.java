public class Tablero {
    private int alsada = 10;
    private int amplada = 10;
    private Casella[][] tablero;
    public Tablero() {
        tablero = new Casella[alsada][amplada];
        omplirTablero();
        imprimirTablero();
    }
    private void omplirTablero() {
        for (int i = 0; i < alsada; i++) {
            for (int j = 0; j < amplada; j++) {
                tablero[i][j] = new Casella('◻' , i , j );

            }
        }
    }
    private void imprimirTablero() {
        for (int i = 0; i < alsada; i++) {
            for (int j = 0; j < amplada; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
