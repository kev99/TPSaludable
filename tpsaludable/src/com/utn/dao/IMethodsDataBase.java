package com.utn.dao;

import java.sql.SQLException;
import java.util.List;

import com.utn.modelo.Persona;

public interface IMethodsDataBase<T extends Persona> {

	public List<T> getAll() throws ClassNotFoundException, SQLException;

	public boolean insert(T tobject) throws ClassNotFoundException, SQLException;

	T get(int id) throws SQLException, ClassNotFoundException;;

}
