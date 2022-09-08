package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        
        System.out.println("");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println("");
    }
    
    public void afficherSeparateurDeTour() {
        System.out.println("");
        System.out.println("**************************************");
        
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        Personnage gagnant;
        if (personnage1.getPointsDeVie()>0) {
            gagnant=personnage1;
        }
        else{
            gagnant=personnage2;
    }
        if(personnage1.getPointsDeVie()==0&& personnage2.getPointsDeVie()==0){
         System.out.println("Les deux combattants ont péri");
        }
        else{
        System.out.println("");
        System.out.println(gagnant.getNom() +" gagne le combat !!!");
        System.out.println("");
        }
    }
    // </editor-fold>
}
