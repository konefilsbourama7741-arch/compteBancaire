package Entites;

public class compteSimple extends Compte{
    private float decouvert;
//constructor
    public compteSimple(float decouvert) {
        super();
        this.decouvert = decouvert;
    }
    //Redifinition de la methode retirer
    public void retirer(float mt){
        if(mt-decouvert<=solde )
            solde-=mt;
    }
    //Redifinition de la classe toString
    public String toString(){
        return("Compte Simple" +super.toString()+"Decouvert="+decouvert );
    }



}
