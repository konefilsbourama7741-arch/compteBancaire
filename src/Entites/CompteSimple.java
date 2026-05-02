package Entites;

public class CompteSimple extends Compte{
    private float decouvert;
//constructor
    public CompteSimple(float decouvert) {
        super();
        this.decouvert = decouvert;
    }
    //Redifinition de la methode retirer
    public void retirer(float mt){
        if(mt-decouvert<=solde )
            solde-=mt;
    }
    //Redefinition de la classe toString
    public String toString(){
        return("Compte Simple" +super.toString()+"Decouvert="+decouvert );
    }



}
