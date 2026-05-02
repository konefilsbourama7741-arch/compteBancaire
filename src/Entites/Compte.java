package Entites;

public class Compte {
    private int code;
    protected float solde;
    private int nbCompte;

    /* public Compte() {
        ++nbCompte;
        code = nbCompte;
        this.solde = 0;


    }*/

    public Compte(int code, float solde, int nbCompte) {
        this.code = code;
        this.solde = solde;
        this.nbCompte = nbCompte;
    }

    public void verser(float mt) {
        solde += mt;
    }

    public void retirer(float mt) {
        if (mt < solde) solde -= mt;
    }

    public String toString() {
        return ("Code=" + code + " Solde=" + solde);
    }
}