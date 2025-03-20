public enum Tipubarco {
    b1(1 , "submarins" , 4 , 'S'),
    b2(2,"fragates" , 2 , 'F'),
    b3(3, "destructors" , 3, 'D'),
    b4(4 , "cuirassats" , 2, 'C'),
    b5(5,"portaavions" , 1, 'P');

    private final int lonjitud;
    private final String nom;
    private final int totalBarcos;
    private final char simbol;


    Tipubarco(int lonjitud, String nom , int totalBarcos, char simbol) {
        this.lonjitud = lonjitud;
        this.nom = nom;
        this.totalBarcos = totalBarcos ;
        this.simbol = simbol;
    }
    public int getLonjitud() {
        return lonjitud;
    }
    public String getNom() {
        return nom;
    }
    public int getTotalBarcos() {
        return totalBarcos;
    }
    public char getSimbol(){
        return simbol;
    }

}
