package personnages;

import java.util.Random;
import java.util.Set;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    
        String nom;
        int pointsDeVie;
        int valeurMaxAttaque;
        int valeurDefense;
        int initiative;
          
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom=nom;
        valeurMaxAttaque=attaqueMax;
        valeurDefense=defense;
        pointsDeVie=pvs;
        initiative=ini;
    }

    public Personnage() {
        nom="";
        valeurMaxAttaque=0;
        valeurDefense=0;
        pointsDeVie=0;
        initiative=0;
    }
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    
    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
        if(this.pointsDeVie<0) this.pointsDeVie=0;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        
        System.out.println("");
        System.out.println(nom);
        System.out.println("    Attaque : "+ valeurMaxAttaque);
        System.out.println("    Defense : "+valeurDefense);
        System.out.println("    Points de vie : "+ pointsDeVie);
        System.out.println("    Initiative : "+ initiative);
        System.out.print("    Statut : ");
        if (pointsDeVie>0) System.out.println("Vivant");
        else System.out.println("Mort");
            
        
    }

    private int attaqueCalcul() {
        Random rand = new Random();

    int minValue = 0;
    int maxValue = valeurMaxAttaque;
    return rand.nextInt(maxValue - minValue) + minValue;
        
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int forceDeFrappe=attaqueCalcul();
        int valeurDefense=personnageCible.getValeurDefense();
        int dommages=forceDeFrappe-valeurDefense;
        if (dommages<0) dommages=0; 
        System.out.println("");
        System.out.println(nom +" attaque avec une puissance de : "+ forceDeFrappe);
        System.out.println(personnageCible.getNom() +" a une defense de  : "+ valeurDefense);
        System.out.println("Les dommages sont donc de : "+dommages);
        personnageCible.setPointsDeVie(personnageCible.getPointsDeVie()-dommages);
        
        
    }

    public void setNewInitiativeRandom() {
        
        Random rand = new Random();

    int minValue = 0;
    int maxValue = 100;
    this.setInitiative(rand.nextInt(maxValue - minValue) + minValue);
    }
    // </editor-fold>
}
