public class Tablero {
    private int alsada = 10;
    private int amplada = 10;
    private char[][] tablero;
    public Tablero() {
        tablero = new char[alsada][alsada];
        omplirTablero(tablero);
        imprimirTablero(tablero);
    }
    private void omplirTablero(char[][] tablero) {
        for (int i = 0; i < alsada; i++) {
            for (int j = 0; j < alsada; j++) {
                tablero[i][j] = '◻';
            }
        }
    }
    private void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < alsada; i++) {
            for (int j = 0; j < alsada; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
