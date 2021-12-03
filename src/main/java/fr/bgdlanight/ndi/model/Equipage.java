package fr.bgdlanight.ndi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Equipage {
    // Attributs
    private final long id;
    private String nom;
    private ArrayList<ActionDeSauvetage> actionDeSauvetages;
    private ArrayList<Personne> personnes;
    private HashMap<Personne, String> postes;

    // Constructeur
    public Equipage(long id, String nom, HashMap<Personne, String> postes, ArrayList<ActionDeSauvetage> actionDeSauvetages, ArrayList<Personne> personnes) {
        this.id = id;
        this.nom = nom;
        this.postes = postes;
        this.actionDeSauvetages = actionDeSauvetages;
        this.personnes = personnes;
    }

    public Equipage(long id, String nom) {
        this.id = id;
        this.nom = nom;
        this.postes = new HashMap<>();
        this.actionDeSauvetages = new ArrayList<>();
        this.personnes = new ArrayList<>();
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

    public void addPersonne(Personne p) { this.personnes.add(p); }

    public void removePersonne(Personne p) { this.personnes.remove(p); }

    public void addPoste(Personne p, String poste) { this.postes.put(p, poste); }

    public void removePoste(Personne p) { this.postes.remove(p); }

}
