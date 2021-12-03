package fr.bgdlanight.ndi.model;

import java.util.Date;

public class Personne {
    // Attributs
    private final long id;
    private String nom;
    private String prenom;
    private Date naissance;
    private Date mort;
    private String lieuNaissance;
    private String lieuMort;
    private String description;

    // Constructeur
    public Personne(long id, String nom, String prenom, Date naissance, Date mort, String lieuNaissance, String lieuMort, String description) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.mort = mort;
        this.lieuNaissance = lieuNaissance;
        this.lieuMort = lieuMort;
        this.description = description;
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

    public String getPrenom() {
        return prenom;
    }

    // Setteurs
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public Date getMort() {
        return mort;
    }

    public void setMort(Date mort) {
        this.mort = mort;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getLieuMort() {
        return lieuMort;
    }

    public void setLieuMort(String lieuMort) {
        this.lieuMort = lieuMort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
