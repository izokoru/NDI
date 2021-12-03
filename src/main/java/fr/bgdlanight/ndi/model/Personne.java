package fr.bgdlanight.ndi.model;

import java.util.Date;
import java.util.List;

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
    private List<Long> ascendants;
    private List<Long> descendants;
    private long epouxse;

    // Constructeur
    public Personne(
            long id,
            String nom,
            String prenom,
            Date naissance,
            Date mort,
            String lieuNaissance,
            String lieuMort,
            String description,
            List<Long> ascendants,
            List<Long> descendants,
            long epouxse
    ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.mort = mort;
        this.lieuNaissance = lieuNaissance;
        this.lieuMort = lieuMort;
        this.description = description;
        this.ascendants = ascendants;
        this.descendants = descendants;
        this.epouxse = epouxse;
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

    public List<Long> getAscendants() {
        return ascendants;
    }

    public void setAscendants(List<Long> ascendants) {
        this.ascendants = ascendants;
    }

    public List<Long> getDescendants() {
        return descendants;
    }

    public void setDescendants(List<Long> descendants) {
        this.descendants = descendants;
    }

    public long getEpouxse() {
        return epouxse;
    }

    public void setEpouxse(long epouxse) {
        this.epouxse = epouxse;
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
