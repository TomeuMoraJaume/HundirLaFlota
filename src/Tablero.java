import java.util.*;

public class Tablero {
    private Random random = new Random();
    private int alsada = 10;
    private int amplada = 10;
    private Casella[][] tablero;
    private static final int MAX_INTENTOS = 1000;

    public Tablero() {
        tablero = new Casella[alsada][amplada];
        omplirTablero();
        generacioBarcos();
        imprimirTablero();
    }

    private void omplirTablero() {
        for (int i = 0; i < alsada; i++) {
            for (int j = 0; j < amplada; j++) {
                tablero[i][j] = new Casella('-');
            }
        }
    }

    private void imprimirTablero() {
        for (int i = 0; i < alsada; i++) {
            for (int j = 0; j < amplada; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void creacioBarcos(Tipubarco tipubarco) {
        int i, j, direccio;
        boolean colocado = false;
        int longitud = tipubarco.getLonjitud();
        int intentos = 0;

        while (!colocado && intentos < MAX_INTENTOS) {
            i = random.nextInt(alsada);
            j = random.nextInt(amplada);
            direccio = random.nextInt(4);
            intentos++;

            if (esPosicionValida(i, j, direccio, longitud) && !teBarcoArop(i, j, direccio, longitud)) {
                colocarBarco(i, j, direccio, longitud, tipubarco);
                colocado = true;
            }
        }
    }

    private boolean teBarcoArop(int i, int j, int direccio, int longitud) {
        for (int k = -1; k <= longitud; k++) {
            int ni = i, nj = j;
            switch (direccio) {
                case 0: ni = i - k; break;
                case 1: nj = j + k; break;
                case 2: ni = i + k; break;
                case 3: nj = j - k; break;
            }

            for (int di = -1; di <= 1; di++) {
                for (int dj = -1; dj <= 1; dj++) {
                    int ai = ni + di, aj = nj + dj;
                    if (ai >= 0 && ai < alsada && aj >= 0 && aj < amplada && tablero[ai][aj].getSimbol() != '-') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean esPosicionValida(int i, int j, int direccio, int longitud) {
        switch (direccio) {
            case 0: return i - longitud >= 0;
            case 1: return j + longitud < amplada;
            case 2: return i + longitud < alsada;
            case 3: return j - longitud >= 0;
            default: return false;
        }
    }

    private void colocarBarco(int i, int j, int direccio, int longitud, Tipubarco tipubarco) {
        char simbolo = tipubarco.getSimbol();

        for (int k = 0; k < longitud; k++) {
            switch (direccio) {
                case 0: tablero[i - k][j] = new Casella(simbolo); break;
                case 1: tablero[i][j + k] = new Casella(simbolo); break;
                case 2: tablero[i + k][j] = new Casella(simbolo); break;
                case 3: tablero[i][j - k] = new Casella(simbolo); break;
            }
        }
    }

    private void generacioBarcos() {
        for (int i = 0; i < Tipubarco.b5.getTotalBarcos(); i++) {
            creacioBarcos(Tipubarco.b5);
        }
        for (int i = 0; i < Tipubarco.b2.getTotalBarcos(); i++) {
            creacioBarcos(Tipubarco.b2);
        }
        for (int i = 0; i < Tipubarco.b3.getTotalBarcos(); i++) {
            creacioBarcos(Tipubarco.b3);
        }
        for (int i = 0; i < Tipubarco.b4.getTotalBarcos(); i++) {
            creacioBarcos(Tipubarco.b4);
        }
        for (int i = 0; i < Tipubarco.b1.getTotalBarcos(); i++) {
            creacioBarcos(Tipubarco.b1);
        }
    }
}