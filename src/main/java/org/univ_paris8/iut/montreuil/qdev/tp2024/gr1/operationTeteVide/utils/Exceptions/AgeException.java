package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions;

public class AgeException extends Exception{
    public AgeException() {
        super("Votre année de naissance n'est pas valide");
    }
}
