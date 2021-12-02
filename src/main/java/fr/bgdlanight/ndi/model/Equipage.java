package fr.bgdlanight.ndi.model;

import java.util.ArrayList;
import java.util.Date;

public class Equipage {
    // Attributs
    private final long id;
    private String nom;
    private ArrayList<ActionDeSauvetage> actionDeSauvetages;

    // Constructeur
    public Equipage(long id, String nom, ArrayList<ActionDeSauvetage> actionDeSauvetages) {
        this.id = id;
        this.nom = nom;
        this.actionDeSauvetages = actionDeSauvetages;
    }

    public Equipage(long id, String nom) {
        this.id = id;
        this.nom = nom;
        this.actionDeSauvetages = new ArrayList<>();
    }

    // Getteurs
    public long getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public ArrayList<ActionDeSauvetage> getActionDeSauvetages() { return this.actionDeSauvetages; }

    // Setteurs
    public void setNom(String nom) { this.nom = nom; }

    public void addActionDeSauvetages(ActionDeSauvetage ads) { this.actionDeSauvetages.add(ads); }

    public void removeActionDeSauvetages(ActionDeSauvetage ads) { this.actionDeSauvetages.remove(ads); }

}
