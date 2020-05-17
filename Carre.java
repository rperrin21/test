/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3;

/**
 *
 * @author apple
 */
public class Carre extends Forme{
    double longueur;
    
    // Constructeurs
    
    public Carre() {
        x = 0;
        y = 0;
        distanceOrigine = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        longueur = 0;
    }
    
    public Carre(int x, int y, double longueur) {
        this.x = x;
        this.y = y;
        this.distanceOrigine = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        this.longueur = longueur;
    }
    
    public Carre(Carre uncarre) {
        this.x = uncarre.x;
        this.y = uncarre.y;
        this.distanceOrigine = Math.sqrt(Math.pow(uncarre.x,2) + Math.pow(uncarre.y,2));
        this.longueur = uncarre.longueur;
    }
    
    // Methodes
    
    @Override
    double getSurface() {
        return longueur*longueur;
    }
    
    @Override
    double getDistance() {
        return distanceOrigine;
    }
    
    @Override
    public String toString () {
        return ("La surface du Carre est " + getSurface());
    }
    
    @Override
    public String messageDistance () {
        return ("La distance du Carre à l'origine est " + getDistance());
    }
}
