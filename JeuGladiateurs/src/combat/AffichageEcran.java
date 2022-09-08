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
        // TODO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
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
        System.out.println("");
        System.out.println(gagnant.getNom() +" gagne le combat !!!");
    }
    // </editor-fold>
}
