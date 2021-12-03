package fr.bgdlanight.ndi.model;

import java.util.Date;

public class Decoration {
    // Attributs
    private final long id;
    private String nom;
    private Date date;
    private boolean dateComplete;

    // Constructeur
    public Decoration(long id, String nom, Date date, boolean dateComplete) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.dateComplete = dateComplete;
    }

    // Getteurs

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    // Setteurs
    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDateComplete() {
        return dateComplete;
    }

    public void setDateComplete(boolean dateComplete) {
        this.dateComplete = dateComplete;
    }
}
