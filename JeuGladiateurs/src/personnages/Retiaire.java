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
public class Retiaire extends Personnage{
    
    String classe;
    Boolean isFiletLancer;
    
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        
        this.nom=nom;
        valeurMaxAttaque=attaqueMax;
        valeurDefense=defense;
        pointsDeVie=pvs;
        initiative=ini;
        classe="Retiaire";
        isFiletLancer=false;
    }

    public Retiaire() {
        nom="";
        valeurMaxAttaque=0;
        valeurDefense=0;
        pointsDeVie=0;
        initiative=0;
        classe="Retiaire";
        isFiletLancer=false;
    }
    
    @Override
    public void afficherInfosPersonnage(){
        
        super.afficherInfosPersonnage();
        System.out.println("    Classe : "+ classe);
        }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        
        System.out.println("");
        if (!isFiletLancer) {
            System.out.println(this.getNom()+ " lance son filet");
            isFiletLancer=true;
                 Random rand = new Random();

                    int minValue = 1;
                    int maxValue = 100;
                    if((rand.nextInt(maxValue - minValue) + minValue)<11){
                        System.out.println("Son filet attrape  "+ personnageCible.getNom()+ "et l'empale sauvagement avec la lance !");
                        personnageCible.setPointsDeVie(0);
                    }
                    else{
                        System.out.println("Le filet n'atteint pas sa cible");
                    }
                    
                    
        }
        else{
            System.out.println(this.getNom()+" ramasse son filet et en profite pour attaquer");
            isFiletLancer=false;
            super.frapperPersonnage(personnageCible);
        }        
        
    }
}
