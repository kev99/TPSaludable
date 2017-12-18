package com.utn.factory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.utn.dao.IConnection;
import com.utn.dao.IMethodsDataBase;
import com.utn.modelo.Paciente;

public class PacienteFactory implements IMethodsDataBase<Paciente> {

	private IConnection connex;

	public PacienteFactory() {
		this.connex = new ConnectionFactory();
	}

	@Override
	public Paciente get(int id) throws ClassNotFoundException, SQLException {

		Paciente paciente = null;

		try {

			Statement st = connex.getConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM pacientes WHERE id = " + id);

			while (rs.next()) {

				paciente = new Paciente(rs.getString("nombre"), rs.getString("apellido"), rs.getInt("dni"),
						rs.getInt("edad"), rs.getString("telefono"), rs.getString("mail"),
						rs.getInt("fechadenacimiento"), rs.getString("localidad"), rs.getString("sexo"),
						rs.getString("usuario"), rs.getString("tipodetratamiento"), rs.getInt("id"));
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return paciente;
	}

	@Override
	public List<Paciente> getAll() throws ClassNotFoundException, SQLException {

		List<Paciente> lista = new ArrayList<>();
		try {

			Statement st = (Statement) connex.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select * from pacientes");

			while (rs.next()) {
				lista.add(new Paciente(rs.getString("nombre"), rs.getString("apellido"), rs.getInt("dni"),
						rs.getInt("edad"), rs.getString("telefono"), rs.getString("mail"),
						rs.getInt("fechadenacimiento"), rs.getString("localidad"), rs.getString("sexo"),
						rs.getString("usuario"), rs.getString("tipodetratamiento"), rs.getInt("id")));
			}


		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Override
	public boolean insert(Paciente tobject) throws ClassNotFoundException, SQLException {
		boolean res = false;
		try {
			String sql = "insert into pacientes (nombre, apellido, dni, edad, telefono, mail, fechadenacimiento, localidad, sexo, usuario, tipodetratamiento, id) values (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) connex.getConnection().prepareStatement(sql);
			ps.setString(1, tobject.getNombre());
			ps.setString(2, tobject.getApellido());
			ps.setInt(3, tobject.getDni());
			ps.setInt(4, tobject.getEdad());
			ps.setString(5, tobject.getTelefono());
			ps.setString(6, tobject.getMail());
			ps.setInt(7, tobject.getFechadenacimiento());
			ps.setString(8, tobject.getLocalidad());
			ps.setString(9, tobject.getSexo());
			ps.setString(10, tobject.getUsuario());
			ps.setString(11, tobject.getTipodetratamiento());
			ps.setInt(12, tobject.getId());

			res = ps.execute();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return res;
	}

}
