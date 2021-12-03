package fr.bgdlanight.ndi.model;

import java.util.List;
import java.util.Vector;

public class Sauveteur {
    // Attributs
    private final long id;
    private Personne personne;
    private String carriere;
    private List<Decoration> decorations;

    // Constructeur
    public Sauveteur(long id, Personne personne, String carriere, List<Decoration> decorations) {
        this.id = id;
        this.personne = personne;
        this.carriere = carriere;
        this.decorations = decorations;
    }

    // Getteurs
    public long getId() {
        return id;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getCarriere() {
        return carriere;
    }

    // Setteurs
    public void setCarriere(String carriere) {
        this.carriere = carriere;
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    public void setDecorations(List<Decoration> decorations) {
        this.decorations = decorations;
    }
}
