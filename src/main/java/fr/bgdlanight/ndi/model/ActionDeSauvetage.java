package fr.bgdlanight.ndi.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class ActionDeSauvetage {
    // Attributs
    private final long id;
    private Date date;
    private String description;
    private ArrayList<Personne> personnes;
    private HashMap<Personne, String> postes;

    // Constructeur
    public ActionDeSauvetage(long id, Date date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.personnes = new ArrayList<>();
    }

    public ActionDeSauvetage(long id, Date date, String description, ArrayList<Personne> personnes) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.personnes = personnes;
    }

    // Getteurs
    public long getId() {
        return this.id;
    }

    public Date getDate() { return this.date; }

    public String getDescription() {
        return this.description;
    }

    // Setteurs
    public void setDescription(String description) { this.description = description; }

    public void setDate(Date date) { this.date = date; }

    public void addPersonne(Personne p) { this.personnes.add(p); }

    public void removePersonne(Personne p) { this.personnes.remove(p); }

    public void addPoste(Personne p, String poste) { this.postes.put(p, poste); }

    public void removePoste(Personne p) { this.postes.remove(p); }
}
