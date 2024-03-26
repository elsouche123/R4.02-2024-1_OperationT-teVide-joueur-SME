package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions;

public class PasDeJoueurException extends Exception{
    public PasDeJoueurException() {
        super("Il n'y a pas de joueur inscrit");
    }
}
