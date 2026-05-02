import Entites.*;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CREATION DES OBJETS DE LA CLASSE PERSONNE
        Personne personne1 =new Personne(1,"xxx","trfd",12,"rfsfrt","12345",new Date(),new Date(),new Date());
        Personne personne2 =new Personne(2,"xxx","uyio",23,"KJHGFD","234566567",new Date(),new Date(),new Date());
        Personne personne3 =new Personne(3,"poit","pmsdf",12,"rdtgh","13456778098",new Date(),new Date(), new Date());
        Personne personne4 =new Personne(5,"vvv","ppp",12,"aeerr","345667", new Date(),new Date(), new Date());
        Personne Personne5 =new Personne(5,"kjom","preonds",23,"loadfr","'23456",new Date(),new Date(),new Date());
        //CREATION DES OBJETS DE LA CLASSE COMPTESIMPLE
        CompteSimple compteSimple1=new CompteSimple(12);
        CompteSimple compteSimple2=new CompteSimple(13);
        CompteSimple compteSimple3=new CompteSimple(19);
        CompteSimple compteSimple4=new CompteSimple(15);
        CompteSimple compteSimple5=new CompteSimple(34);
        //CREATION DES OBJETS DE LA CLASSE COMPTEPAYANT
        ComptePayant comptePayant1 =new ComptePayant();
        ComptePayant comptePayant2 =new ComptePayant();
        ComptePayant comptePayant3 =new ComptePayant();
        ComptePayant comptepayant4 =new ComptePayant();
        ComptePayant Comptepayant5 =new ComptePayant();
        //CREATION DES OBJETS DE LA CLASSE COMPTEEPARGNE
        CompteEpargne compteEpargne1 =new CompteEpargne(21);
        CompteEpargne compteEpargne2 =new CompteEpargne(34);
        CompteEpargne compteEpargne3 =new CompteEpargne(90);
        CompteEpargne compteEpargne4 =new CompteEpargne(56);
        CompteEpargne compteEpargne5 =new CompteEpargne(67);
//CREATION DES OBJETS DE LA CLASSE COMPTE
        Compte compte1 =new Compte(1,34,45);
        Compte comppt2 =new Compte(2,34,57);
        Compte compte3 =new Compte(56,90,57);
        Compte compte4 =new Compte(67,78,90);
        Compte compte5 =new Compte(65,5, 67);






        }
    }
?