package fr.isty.iatic5.sessions.service;

/************************************************************/
/**
 * 
 */
public interface SessionInterface {
	/**
	 * 
	 */
	public String createEU(String JSONEntry);

	/**
	 * 
	 */
	public String createCreneau(String JSONEntry);

	/**
	 * 
	 */
	public String createClasse(String JSONEntry);

	/**
	 * 
	 */
	public String createSession(String JSONEntry);

	/**
	 * 
	 */
	public String changeCreneauSession(String JSONEntry);

	/**
	 * 
	 */
	public String createSessionCreneau(String JSONEntry);

	/**
	 * 
	 */
	public String deleteEU(String JSONEntry);

	/**
	 * 
	 */
	public String deleteCreneau(String JSONEntry);

	/**
	 * 
	 */
	public String deleteSession(String JSONEntry);

	/**
	 * 
	 */
	public String deleteClasse(String JSONEntry);
	
	public String getClasse(String JSONEntry);
	public String getSession(String JSONEntry);
	public String getCreneau(String JSONEntry);
	public String getUE(String JSONEntry);
	public String listClasse();
	public String listSession();
	public String listCreneau();
	public String listEU();
};
