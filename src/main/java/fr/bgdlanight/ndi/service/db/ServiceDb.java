package fr.bgdlanight.ndi.service.db;

import fr.bgdlanight.ndi.model.Personne;

public interface ServiceDb {
    Personne getPersonneById(long id) throws Exception;
}
