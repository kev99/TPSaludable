package com.utn.modelo;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private String telefono;
	private String mail;
	private int fechadenacimiento;
	private String localidad;
	private String sexo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getFechadenacimiento() {
		return fechadenacimiento;
	}

	public void setFechadenacimiento(int fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Persona(String nombre, String apellido, int dni, int edad, String telefono, String mail,
			int fechadenacimiento, String localidad, String sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.telefono = telefono;
		this.mail = mail;
		this.fechadenacimiento = fechadenacimiento;
		this.localidad = localidad;
		this.sexo = sexo;
	}

	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona() {

	}

}
