public class Casella {

    private final char simbol;
    private boolean tepesaBarco;
    private boolean destapada;
    public Casella(char simbol) {
        this.simbol = simbol;
        this.destapada = false;
    }

    @Override
    public String toString() {
        return String.valueOf(simbol);
    }


}
