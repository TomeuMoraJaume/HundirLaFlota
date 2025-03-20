public class Casella {

    private char simbol;
    private boolean tepesaBarco;
    private boolean destapada;
    Barco barco;
    public Casella(char simbol) {
        if (simbol == '-') {
            this.simbol = simbol;
            this.destapada = false;
        } else if (simbol != '-' ){
            this.simbol = simbol;
            barco = new Barco(simbol);
        }
    }

    @Override
    public String toString() {
        if (destapada) {
            return String.valueOf(simbol);
        } else {
            simbol = '-';
            return String.valueOf(simbol);
        }

    }


    public char getSimbol() {
        return simbol;
    }
}
