package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto.JoueursDto;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireJoueurs {

    private static final GestionnaireJoueurs INSTANCE = new GestionnaireJoueurs();
    private List<JoueursDto> joueurs = new ArrayList<>();

    private GestionnaireJoueurs() {}

    public static GestionnaireJoueurs getInstance() {
        return INSTANCE;
    }

    public void ajouterJoueur(JoueursDto joueur) {
        joueurs.add(joueur);
    }

    public List<JoueursDto> getJoueurs() {
        return joueurs;
    }
}
