package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions;

public class ErreurChoixLangueException extends Exception{
    public ErreurChoixLangueException() {
        super("Le numéro de la langue n'existe pas!");
    }
}
