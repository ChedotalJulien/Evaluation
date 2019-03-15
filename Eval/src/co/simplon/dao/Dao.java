package co.simplon.dao;
import java.sql.Connection;

import co.simplon.dao.BANKConnection;


public abstract class Dao<T> {

	public Connection connection = BANKConnection.getConnection();

	/**
	 * Permet de récupérer un objet via son ID
	 * @param id
	 * @return T
	 */
	public abstract T find(int idCust);

	/**
	 * Permet de créer une entrée dans la base de données
	 * par rapport à un objet
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean create (T obj);

	/**
	 * Permet de mettre à jour les données d'une entrée dans la base 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj);

	/**
	 * Permet la suppression d'une entrée de la base
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj);

	public boolean create(Object cpt1) {
		return false;
	}

	public boolean create(Object cpt1) {
		return false;
	}

	public boolean update(Object cpt1) {
		return false;
	}

	public boolean create(Object cpt1) {
		return false;
	}

	public boolean create(Object cpt1) {
		return false;
	}

	public boolean update(Object cpt1) {
		return false;
	}
}


