package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto.JoueursDto;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.interfaces.IJoueursService;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.ErreurSaisieException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.PseudoExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.AgeException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.CentresInteretsVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.ErreurChoixLangueException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.PrenomException;

import java.util.List;

public class JoueurImplTestMock implements IJoueursService {

    @Override
    public JoueursDto creerJoueur(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        return new JoueursDto(prenom,pseudo,age,centresInterets,choixLangue);
    }
    public JoueursDto creerJoueurPseudoExistantException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        throw new PseudoExistantException();
    }
    public JoueursDto creerJoueurAgeException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        throw new AgeException();
    }
    public JoueursDto creerJoueurPrenomException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        throw new PrenomException();
    }
    public JoueursDto creerJoueurCentresInteretsException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        throw new CentresInteretsVideException();
    }
    public JoueursDto creerJoueurChoixLangueException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        throw new ErreurChoixLangueException();
    }
}

