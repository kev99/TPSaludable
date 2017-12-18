package com.utn.modelo;

public class Paciente extends Persona {
	
	private String usuario;
	private String contraseña;
	private String tipodetratamiento;
    private int id;
	
    
    
    public Paciente() {
		
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getContraseña() {
		return contraseña;
	}



	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}



	public String getTipodetratamiento() {
		return tipodetratamiento;
	}



	public void setTipodetratamiento(String tipodetratamiento) {
		this.tipodetratamiento = tipodetratamiento;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Paciente(String nombre, String apellido, int dni, int edad, String telefono, String mail,
			int fechadenacimiento, String localidad, String sexo, String tipodetratamiento) {
		super(nombre, apellido, dni, edad, telefono, mail, fechadenacimiento, localidad, sexo);
		this.tipodetratamiento = tipodetratamiento;
	}



	public Paciente(String nombre, String apellido, int dni, int edad, String telefono, String mail,
			int fechadenacimiento, String localidad, String sexo, String usuario, String tipodetratamiento, int id) {
		super(nombre, apellido, dni, edad, telefono, mail, fechadenacimiento, localidad, sexo);
		this.usuario = usuario;
		this.tipodetratamiento = tipodetratamiento;
		this.id = id;
	}



	



    
	


    	
    }

