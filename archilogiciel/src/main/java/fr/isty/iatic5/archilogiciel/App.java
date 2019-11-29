package fr.isty.iatic5.archilogiciel;

import java.sql.*;

import database.OperationsDB;

/**
 * Classe principale
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/**
		 * Insertion dans les tables
		 */

		// Insertion dans la table uniteenseignement
		OperationsDB.insertIntoTableUniteEnseignement(1, "SOA", "Yahiya", "iatic5");

		// Insertion dans la table eleve
		OperationsDB.insertIntoTableEleve(1, 1, "Jalled", "iatic5");
		OperationsDB.insertIntoTableEleve(2, 1, "Paul", "iatic5");

		// Insertion dans la table Sujet
		OperationsDB.insertIntoTableSujet(1, "Projet micro-services");

		// Insertion dans la table Groupes
		OperationsDB.insertIntoTableSujet(1, "Groupe 4");

		/**
		 * Suppression dans les tables
		 */

		// Suppression dans la table uniteenseignement
		OperationsDB.deleteIntoTableUniteEnseignement(1);

		// Suppression dans la table eleve
		OperationsDB.deleteIntoTableEleve(2);

		// Suppression dans la table Sujet
		OperationsDB.deleteIntoTableSujet(1);

		// Suppression dans la table Groupes
		OperationsDB.deleteIntoTableGroupes(1);

	}
}
