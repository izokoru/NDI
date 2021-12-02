package fr.bgdlanight.ndi.model;

import java.util.Date;

public class Personne {
    // Attributs
    private final long id;
    private final String nom;
    private final String prenom;
    private final Date naissance;
    private final Date mort;
    private final String lieuNaissance;
    private final int departementNaissance;
    private final String urlPhoto;
    private final String description;

    // Constructeur
    public Personne(long id, String nom, String prenom, Date naissance, Date mort, String lieuNaissance, int departementNaissance, String urlPhoto, String description) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.mort = mort;
        this.lieuNaissance = lieuNaissance;
        this.departementNaissance = departementNaissance;
        this.urlPhoto = urlPhoto;
        this.description = description;
    }

    // Getteurs
    public long getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public Date getNaissance() {
        return this.naissance;
    }

    public Date getMort() {
        return this.mort;
    }

    public String getLieuNaissance() {
        return this.lieuNaissance;
    }

    public int getDepartementNaissance() {
        return this.departementNaissance;
    }

    public String getUrlPhoto() {
        return this.urlPhoto;
    }

    public String getDescription() {
        return this.description;
    }

    // Setteurs

}
