package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto.JoueursDto;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.interfaces.IJoueursService;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.PseudoExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.AgeException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.CentresInteretsVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.ErreurChoixLangueException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.PrenomException;

import java.util.List;

public class JoueurChoixLangueImplTestMock implements IJoueursService {
    @Override
    public JoueursDto creerJoueur(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws ErreurChoixLangueException {
        throw new ErreurChoixLangueException();
    }
}
