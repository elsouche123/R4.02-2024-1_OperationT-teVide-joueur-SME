package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils;

import org.junit.Assert;
import org.junit.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto.JoueursDto;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.PseudoExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.AgeException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.CentresInteretsVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.ErreurChoixLangueException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.PrenomException;

import java.util.ArrayList;
import java.util.List;

public class JoueurImplTest {
    ArrayList<String> cI = new ArrayList<>();
    JoueursDto j1 = new JoueursDto("a", "a", 2004, cI, 2);

    @Test
    public JoueursDto creerJoueur(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) {
        return new JoueursDto(prenom, pseudo, age, centresInterets, choixLangue);

    }

    @Test
    public JoueursDto creerJoueurPseudoExistantException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException {
        JoueursDto joueursDto = new JoueursDto(prenom, pseudo, age, centresInterets, choixLangue);
        if (joueursDto.getPseudo().equals(j1.getPseudo())) {
            throw new PseudoExistantException();
        }
        return joueursDto;
    }
    @Test
    public JoueursDto creerJoueurAgeException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        JoueursDto joueursDto = new JoueursDto(prenom, pseudo, age, centresInterets, choixLangue);
        if (joueursDto.getAge() <1933){
            throw new AgeException();
        }
        return joueursDto;
    }@Test
    public JoueursDto creerJoueurPrenomException(String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        JoueursDto joueursDto = new JoueursDto("*/**", pseudo, age, centresInterets, choixLangue);
        if (joueursDto.getPrenom().contains("/")){
            throw new PrenomException();
        }return joueursDto;
    }@Test
    public JoueursDto creerJoueurCentresInteretsException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        JoueursDto joueursDto = new JoueursDto(prenom, pseudo, age, centresInterets, choixLangue);
        if (joueursDto.getCentresInterets().isEmpty()){
            throw new CentresInteretsVideException();
        }return joueursDto;
    }
    @Test
    public JoueursDto creerJoueurChoixLangueException(String prenom, String pseudo, int age, List<String> centresInterets, int choixLangue) throws PseudoExistantException, AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException {
        JoueursDto joueursDto = new JoueursDto(prenom, pseudo, age, centresInterets, choixLangue);
        if (joueursDto.getLanguePreferee() > 5){
            throw new ErreurChoixLangueException();
        }return joueursDto;
    }
}

