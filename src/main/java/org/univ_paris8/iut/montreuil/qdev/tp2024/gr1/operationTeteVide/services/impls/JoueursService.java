package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.impls;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto.JoueursDto;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.interfaces.IJoueursService;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.ErreurSaisieException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.GestionnaireJoueurs;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.PseudoExistantException;

import java.util.List;

public class JoueursService implements IJoueursService {

    @Override
    public JoueursDto creerJoueur(String prenom, String pseudo, int age, List<String> centresInterets, String choixLangue) throws PseudoExistantException, ErreurSaisieException {
        if (prenom == null || pseudo == null || age <= 0 || choixLangue == null) {
            throw new ErreurSaisieException("Les données fournies sont invalides.");
        }

        List<JoueursDto> joueursExistant = GestionnaireJoueurs.getInstance().getJoueurs();
        for (JoueursDto joueur : joueursExistant) {
            if (joueur.getPseudo().equals(pseudo)) {
                throw new PseudoExistantException("Le pseudo " + pseudo + " est déjà utilisé.");
            }
        }

        JoueursDto nouveauJoueur = new JoueursDto(prenom, pseudo, age, centresInterets, choixLangue);
        GestionnaireJoueurs.getInstance().ajouterJoueur(nouveauJoueur);

        return nouveauJoueur;
    }
}
