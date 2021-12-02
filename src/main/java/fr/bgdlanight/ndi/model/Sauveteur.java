package fr.bgdlanight.ndi.model;

import java.util.List;
import java.util.Vector;

public class Sauveteur {
    // Attributs
    private final long id;
    private final Personne personne;
    private final String carriere;
    private final List<Decoration> decorations;

    // Constructeur
    public Sauveteur(long id, Personne personne, String carriere, List<Decoration> decorations) {
        this.id = id;
        this.personne = personne;
        this.carriere = carriere;
        this.decorations = decorations;
    }

    // Getteurs
}
