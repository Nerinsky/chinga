package com.example.demo.model;

public class Proveedores {
	
	private String IdProveedor;
	private String NombreCompania;
	private String NombreContacto;
	private String Email;
	private String Rfc;
	private String Telefono;
	private String Direccion;
		
	public Proveedores() {}
	
	public Proveedores(String IdProveedor, String NombreCompania ,String NombreContacto, String Email, String Rfc, String Telefono, String Direccion) {
		super();
		this.IdProveedor = IdProveedor;
		this.NombreCompania = NombreCompania;
		this.NombreContacto = NombreContacto;
		this.Email = Email;
		this.Rfc = Rfc;
		this.Telefono = Telefono;
		this.Direccion = Direccion;
	}

	public String getIdProveedor() {
		return IdProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		IdProveedor = idProveedor;
	}

	public String getNombreCompania() {
		return NombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		NombreCompania = nombreCompania;
	}

	public String getNombreContacto() {
		return NombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		NombreContacto = nombreContacto;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRfc() {
		return Rfc;
	}

	public void setRfc(String rfc) {
		Rfc = rfc;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
