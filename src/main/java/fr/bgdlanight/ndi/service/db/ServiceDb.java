package fr.bgdlanight.ndi.service.db;

import fr.bgdlanight.ndi.model.ActionDeSauvetage;
import fr.bgdlanight.ndi.model.Equipage;
import fr.bgdlanight.ndi.model.Personne;

import java.util.ArrayList;

public interface ServiceDb {
    Personne getPersonneById(long id) throws Exception;

    ActionDeSauvetage getActionById(long id) throws Exception;

    Equipage getEquipageById(long id) throws Exception;

    ArrayList<Personne> getPersonnes() throws Exception;

    ArrayList<ActionDeSauvetage> getActions() throws Exception;
}
