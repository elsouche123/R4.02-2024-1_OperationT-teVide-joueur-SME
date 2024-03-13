package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions;

public class PseudoExistantException extends Exception{
    public PseudoExistantException() {
        super("Le pseudo existe déjà");
    }
}
