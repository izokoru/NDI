package fr.bgdlanight.ndi.model;

import java.util.Date;

public class Decoration {
    // Attributs
    private final long id;
    private final String nom;
    private final Date date;
    private final boolean dateComplete;

    // Constructeur
    public Decoration(long id, String nom, Date date, boolean dateComplete) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.dateComplete = dateComplete;
    }

    // Getteurs
    public long getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public Date getDate() {
        return this.date;
    }

    public boolean isDateComplete() {
        return this.dateComplete;
    }
}
