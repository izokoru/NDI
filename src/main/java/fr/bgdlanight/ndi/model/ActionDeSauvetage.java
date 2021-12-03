package fr.bgdlanight.ndi.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class ActionDeSauvetage {
    // Attributs
    private final long id;
    private Date date;
    private String description;
    private int idEquipage;
    private int idSauveteur;

    // Constructeur
    public ActionDeSauvetage(long id, Date date, String description, int idEquipage, int idSauveteur) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.idEquipage = idEquipage;
        this.idSauveteur = idSauveteur;
    }

    // Getteurs
    public long getId() {
        return this.id;
    }

    public Date getDate() { return this.date; }

    public String getDescription() {
        return this.description;
    }

    public int getIdEquipage() { return this.idEquipage; }

    public int getIdSauveteur() { return this.idSauveteur; }

    // Setteurs
    public void setDescription(String description) { this.description = description; }

    public void setDate(Date date) { this.date = date; }

    public void setIdEquipage(int id) { this.idEquipage = id; }

    public void setIdSauveteur(int id) { this.idSauveteur = id; }

}
