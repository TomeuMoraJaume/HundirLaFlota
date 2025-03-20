public class Casella {

    private final char simbol;
    private boolean tepesaBarco;
    private boolean destapada;
    private int cord1;
    private int cord2;
    public Casella(char simbol , int cord1 , int cord2 ) {
        this.simbol = simbol;
        this.destapada = false;
        this.cord1 = cord1;
        this.cord2 = cord2;
        Barco segment = new PesaBarco();
    }

    @Override
    public String toString() {
        return String.valueOf(simbol);
    }

    public int[] getCords(){
        return new int[]{cord1, cord2};
    }
}
