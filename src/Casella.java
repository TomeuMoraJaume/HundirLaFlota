public class Casella {
    private char simbol;

    public Casella(char simbol) {
        this.simbol = simbol;
    }

    @Override
    public String toString() {
        return String.valueOf(simbol);
    }
}
