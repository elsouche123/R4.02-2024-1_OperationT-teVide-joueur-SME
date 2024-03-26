package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto.JoueursDto;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.impl.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.PseudoExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.AgeException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.CentresInteretsVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.ErreurChoixLangueException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.PrenomException;
import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

//import static org.junit.jupiter.api.AssertThrows.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JoueurImplTest {
    ArrayList<String> cI = new ArrayList<>();
    JoueursDto j1 = new JoueursDto("a", "a", 2004, cI, 2);
    JoueurPrenomImplTestMock prenomMock = new JoueurPrenomImplTestMock();
    JoueurAgeImplTestMock age = new JoueurAgeImplTestMock();
    JoueurPseudoImplTestMock pseudoMock = new JoueurPseudoImplTestMock();
    JoueurChoixLangueImplTestMock langueMock = new JoueurChoixLangueImplTestMock();
    JoueurCentresInteretsImplTestMock cIMock = new JoueurCentresInteretsImplTestMock();

    @Test
    void creerJoueur(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) {
        //assert(JoueursDto)
    }

    @Test
    void creerJoueurPseudoExistantException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException {
        assertThrows(PseudoExistantException.class, ()->pseudoMock.creerJoueur(prenom, pseudo, age, centresInterets, choixLangue));
    }
    @Test
    void creerJoueurAgeException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws  AgeException {
        assertThrows(AgeException.class, ()->prenomMock.creerJoueur("*/**", pseudo, 1800, centresInterets, choixLangue));

    }
    @Test
    void creerJoueurPrenomException(String pseudo, int age, List<String> centresInterets, int choixLangue) throws  PrenomException {
        assertThrows(PrenomException.class, ()->prenomMock.creerJoueur("*/**", pseudo, age, centresInterets, choixLangue));
    }
    @Test
    void creerJoueurCentresInteretsException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws  CentresInteretsVideException{
        assertThrows(CentresInteretsVideException.class, ()->cIMock.creerJoueur(prenom, pseudo, age, centresInterets, choixLangue));


    }
    @Test
    void creerJoueurChoixLangueException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws ErreurChoixLangueException {
        assertThrows(ErreurChoixLangueException.class, ()->langueMock.creerJoueur(prenom, pseudo, age, centresInterets, choixLangue));
    }
}

