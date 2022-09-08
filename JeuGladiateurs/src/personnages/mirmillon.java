/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author ETI
 */
public class mirmillon extends Personnage{
    
    String classe;
    
   
    public mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom=nom;
        valeurMaxAttaque=attaqueMax;
        valeurDefense=defense;
        pointsDeVie=pvs;
        initiative=ini;
        classe="mirmillon";
    }

    public mirmillon() {
        nom="";
        valeurMaxAttaque=0;
        valeurDefense=0;
        pointsDeVie=0;
        initiative=0;
        classe="mirmillon";
    }
    
    
    @Override
    public void afficherInfosPersonnage(){
        
        super.afficherInfosPersonnage();
        System.out.println("    Classe : "+ classe);
            
        
    }
    @Override
    public void setNewInitiativeRandom() {
        
        Random rand = new Random();

    int minValue = 0;
    int maxValue = 30;
    this.setInitiative(rand.nextInt(maxValue - minValue) + minValue);
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        
        super.frapperPersonnage(personnageCible);
        if (personnageCible.getPointsDeVie()<1) {
            System.out.println(this.getNom()+" a decapite "+ personnageCible.getNom());
        }
        else{
            super.frapperPersonnage(personnageCible);
        }
       
    }
}
