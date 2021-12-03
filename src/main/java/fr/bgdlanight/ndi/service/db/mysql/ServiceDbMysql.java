package fr.bgdlanight.ndi.service.db.mysql;

import fr.bgdlanight.ndi.model.Personne;
import fr.bgdlanight.ndi.service.db.ServiceDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;

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
            return new Personne(
                    resultSet.getInt("id"),
                    resultSet.getString("nom"),
                    resultSet.getString("prenom"),
                    resultSet.getDate("naissance"),
                    resultSet.getDate("mort"),
                    resultSet.getString("lieuNaissance"),
                    resultSet.getString("lieuMort"),
                    resultSet.getString("description")
            );
        } else {
            return null;
        }
    }
}
