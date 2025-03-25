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
            this.destapada = false;
        }
    }

    @Override
    public String toString() {
        if (destapada) {
            return String.valueOf(simbol);
        } else if (simbol == '·') {
            if (destapada) {
                simbol = '·';
            } else {
                simbol = '-';
                return String.valueOf(simbol);
            }
        }
        return "·";
    }



    public char getSimbol() {
        return simbol;
    }

    public void setDestapat(boolean destipada) {
        this.destapada = destipada;
    }
}
