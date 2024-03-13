package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions;

public class JoueurIntrouvableException extends Exception{
    public JoueurIntrouvableException() {
        super("Le joueur n'existe pas");
    }
}
