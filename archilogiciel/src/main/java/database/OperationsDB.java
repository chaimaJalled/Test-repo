package database;

import java.sql.*;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class OperationsDB {
	
	public static Config configuration = ConfigFactory.load();
	

	/**
	 * Fonction pour insérer une ligne dans la table MySQL uniteenseignement
	 * @param ueId
	 * @param nomCours
	 * @param enseignant
	 * @param niveau
	 * @throws SQLException
	 */
	public static void insertIntoTableUniteEnseignement(int ueId, String nomCours, String enseignant, String niveau) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_requeteInsertUniteEnseignement = configuration.getString("db_requeteInsertUniteEnseignement");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_requeteInsertUniteEnseignement);
            preparedStatement.setInt(1, ueId);
            preparedStatement.setString(2, nomCours);
            preparedStatement.setString(3, enseignant);
            preparedStatement.setString(4, niveau);
            
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible d'inserer dans la table uniteenseignement : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
	
	/**
	 * Fonction pour insérer une ligne dans la table MySQL eleve
	 * @param eleveId
	 * @param ueId
	 * @param nom
	 * @param niveau
	 * @throws SQLException
	 */
	
	public static void insertIntoTableEleve(int eleveId, int ueId, String nom, String niveau) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_requeteInsertEleve = configuration.getString("db_requeteInsertEleve");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_requeteInsertEleve);
            preparedStatement.setInt(1, eleveId);
            preparedStatement.setInt(2, ueId);
            preparedStatement.setString(3, nom);
            preparedStatement.setString(4, niveau);
            
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible d'inserer dans la table Eleve : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

	
	/**
	 * Fonction pour insérer une ligne dans la table MySQL sujet
	 * @param sujetId
	 * @param sujetNom
	 * @throws SQLException
	 */
	
	public static void insertIntoTableSujet(int sujetId, String sujetNom) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_requeteInsertSujet = configuration.getString("db_requeteInsertSujet");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_requeteInsertSujet);
            
            preparedStatement.setInt(1, sujetId);
            preparedStatement.setString(2, sujetNom);
            
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible d'inserer dans la table Sujet : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
	
	
	/**
	 * Fonction pour insérer une ligne dans la table MySQL groupes
	 * @param groupesId
	 * @param nomGroupes
	 * @throws SQLException
	 */
	
	public static void insertIntoTableGroupes(int groupesId, String nomGroupes) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_requeteInsertGroupes = configuration.getString("db_requeteInsertGroupes");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_requeteInsertGroupes);
            
            preparedStatement.setInt(1, groupesId);
            preparedStatement.setString(2, nomGroupes);
            
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible d'inserer dans la table Groupes : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

	
	/**
	 * Fonction pour supprimer la ligne dont l'id est dans le parametre de la fonction
	 * depuis la table uniteenseignement
	 * @param ueId
	 * @throws SQLException
	 */
	public static void deleteIntoTableUniteEnseignement(int ueId) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_deleteRawFromUniteEnseignement = configuration.getString("db_deleteRawFromUniteEnseignement");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_deleteRawFromUniteEnseignement);
            preparedStatement.setInt(1, ueId);
            
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible de supprimer la ligne dont l'id est "+ueId+ " depuis la table uniteenseignement : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
	
	/**
	 * Fonction pour supprimer la ligne dont l'id est dans le parametre de la fonction
	 * depuis la table eleve
	 * @param eleveId
	 * @throws SQLException
	 */
	
	public static void deleteIntoTableEleve(int eleveId) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_deleteRawFromEleve = configuration.getString("db_deleteRawFromEleve");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_deleteRawFromEleve);
            preparedStatement.setInt(1, eleveId);
           
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible de supprimer la ligne dont l'id est "+eleveId+ " depuis la table eleve : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

	
	/**
	 * Fonction pour supprimer la ligne dont l'id est dans le parametre de la fonction
	 * depuis la table sujet
	 * @param sujetId
	 * @throws SQLException
	 */
	public static void deleteIntoTableSujet(int sujetId) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_deleteRawFromSujet = configuration.getString("db_deleteRawFromSujet");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_deleteRawFromSujet);
            preparedStatement.setInt(1, sujetId);
           
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible de supprimer la ligne dont l'id est "+sujetId+ " depuis la table sujet : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
	
	/**
	 * Fonction pour supprimer la ligne dont l'id est dans le parametre de la fonction
	 * depuis la table groupes
	 * @param groupesId
	 * @throws SQLException
	 */
	public static void deleteIntoTableGroupes(int groupesId) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        String db_deleteRawFromGroupes = configuration.getString("db_deleteRawFromGroupes");
        
        try {
            dbConnection = ConnectDB.bdConnect();
            preparedStatement = dbConnection.prepareStatement(db_deleteRawFromGroupes);
            preparedStatement.setInt(1, groupesId);
           
            preparedStatement.execute();
            
        } catch (Exception e) {
        	System.out.println("Impossible de supprimer la ligne dont l'id est "+groupesId+ " depuis la table groupes : " + e.getMessage());
        	e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

}
