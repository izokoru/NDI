package fr.bgdlanight.ndi.service.db.mysql;

import fr.bgdlanight.ndi.model.ActionDeSauvetage;
import fr.bgdlanight.ndi.model.Personne;
import fr.bgdlanight.ndi.service.db.ServiceDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ServiceDbMysql implements ServiceDb {
    // Constantes
    private static final String URL = "jdbc:mariadb://mysql-cestquoiunpc.alwaysdata.net:3306/cestquoiunpc_sql";
    private static final String LOGIN = "251284";
    private static final String PASSWD = "ndi45100";

    // Getteurs
    @Override
    public Personne getPersonneById(long id) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWD);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM Personne WHERE id = " + id + ";";
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            Personne personne = new Personne(
                    resultSet.getInt("id"),
                    resultSet.getString("nom"),
                    resultSet.getString("prenom"),
                    resultSet.getDate("naissance"),
                    resultSet.getDate("mort"),
                    resultSet.getString("lieuNaissance"),
                    resultSet.getString("lieuMort"),
                    resultSet.getString("description"),
                    new ArrayList<>(),
                    new ArrayList<>(),
                    0
            );

            statement = connection.createStatement();
            sql = "SELECT idMarie2 AS id FROM (SELECT idMarie1, idMarie2, dateMariage FROM Mariage UNION (SELECT idMarie2 AS idMarie1, idMarie1 AS idMarie2, dateMariage FROM Mariage)) as T WHERE idMarie1 = " + id + ";";
            resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                personne.setEpouxse(resultSet.getInt("id"));
            }

            statement = connection.createStatement();
            sql = "SELECT idEnfant AS id FROM Descendance WHERE idParent = " + id + ";";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                personne.getDescendants().add(resultSet.getLong("id"));
            }

            statement = connection.createStatement();
            sql = "SELECT idParent AS id FROM Descendance WHERE idEnfant = " + id + ";";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                personne.getAscendants().add(resultSet.getLong("id"));
            }

            return personne;
        } else {
            return null;
        }
    }

    @Override
    public ActionDeSauvetage getActionById(long id) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWD);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM ActionDeSauvetage WHERE id = " + id + ";";
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            ActionDeSauvetage actionDeSauvetage = new ActionDeSauvetage(
                    resultSet.getInt("id"),
                    resultSet.getDate("dateSauvetage"),
                    resultSet.getString("description"),
                    resultSet.getInt("idEquipage"),
                    resultSet.getInt("idSauveteur")
            );

            return actionDeSauvetage;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<Personne> getPersonnes() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWD);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM Personne;";
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Personne> personnes = new ArrayList<>();

        while (resultSet.next()) {
            personnes.add(new Personne(
                    resultSet.getInt("id"),
                    resultSet.getString("nom"),
                    resultSet.getString("prenom"),
                    resultSet.getDate("naissance"),
                    resultSet.getDate("mort"),
                    resultSet.getString("lieuNaissance"),
                    resultSet.getString("lieuMort"),
                    resultSet.getString("description"),
                    new ArrayList<>(),
                    new ArrayList<>(),
                    0
            ));
        }
        return personnes;
    }

    @Override
    public ArrayList<ActionDeSauvetage> getActions() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWD);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM ActionDeSauvetage;";
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<ActionDeSauvetage> actionDeSauvetages = new ArrayList<>();

        while (resultSet.next()) {
            actionDeSauvetages.add(new ActionDeSauvetage(
                    resultSet.getInt("id"),
                    resultSet.getDate("dateSauvetage"),
                    resultSet.getString("description"),
                    resultSet.getInt("idEquipage"),
                    resultSet.getInt("idSauveteur")
            ));
        }
        return actionDeSauvetages;
    }
}
