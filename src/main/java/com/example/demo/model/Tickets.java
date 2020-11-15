package com.example.demo.model;

public class Tickets {
	
	private String IdTicket;
	private String IdVenta;
	private String NoSerie;
	private String Cantidad;
	private String Precio;
		
	public Tickets() {}
	
	public Tickets(String IdTicket, String IdVenta,String NoSerie, String Cantidad, String Precio) {
		super();
		this.IdTicket = IdTicket;
		this.IdVenta = IdVenta;
		this.NoSerie = NoSerie;
		this.Cantidad = Cantidad;
		this.Precio = Precio;		
	}

	public String getIdTicket() {
		return IdTicket;
	}

	public void setIdTicket(String idTicket) {
		IdTicket = idTicket;
	}

	public String getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}

	public String getNoSerie() {
		return NoSerie;
	}

	public void setNoSerie(String noSerie) {
		NoSerie = noSerie;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	

}
