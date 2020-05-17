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
public class Triangle extends Forme {
    double hauteur;
    double base;
    
    // Constructeurs
    
    public Triangle() {
        x = 0;
        y = 0;
        distanceOrigine = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        hauteur = 0;
        base = 0;
    }
    
    public Triangle(int x, int y, double hauteur, double base) {
        this.x = x;
        this.y = y;
        this.distanceOrigine = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        this.hauteur = hauteur;
        this.base = base;
    }
    
    public Triangle(Triangle untriangle) {
        this.x = untriangle.x;
        this.y = untriangle.y;
        this.distanceOrigine = Math.sqrt(Math.pow(untriangle.x,2) + Math.pow(untriangle.y,2));
        this.hauteur = untriangle.hauteur;
        this.base = untriangle.base;
    }
    
    // Methodes
    
    @Override
    double getSurface() {
        return base*hauteur/2;
    }
    
    @Override
    double getDistance() {
        return distanceOrigine;
    }
    
    @Override
    public String toString () {
        return ("La surface du Triangle est " + getSurface());
    }
    
    @Override
    public String messageDistance () {
        return ("La distance du Triangle à l'origine est " + getDistance());
    }
}
