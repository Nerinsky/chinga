package com.example.demo.model;

public class Venta {
	
	private String IdVenta;
	private String IdUsuario;
	private String Fecha;
	private String Subtotal;
	private String Iva;
	private String CostoEnvio;
	private String Total;
		
	public Venta() {}
	
	public Venta(String IdVenta, String IdUsuario,String Fecha, String Subtotal, String Iva, String CostoEnvio, String Total) {
		super();
		this.IdVenta = IdVenta;
		this.IdUsuario = IdUsuario;
		this.Fecha = Fecha;
		this.Subtotal = Subtotal;
		this.Iva = Iva;
		this.CostoEnvio = CostoEnvio;
		this.Total = Total;
	}

	public String getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}

	public String getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(String subtotal) {
		Subtotal = subtotal;
	}

	public String getIva() {
		return Iva;
	}

	public void setIva(String iva) {
		Iva = iva;
	}

	public String getCostoEnvio() {
		return CostoEnvio;
	}

	public void setCostoEnvio(String costoEnvio) {
		CostoEnvio = costoEnvio;
	}

	public String getTotal() {
		return Total;
	}

	public void setTotal(String total) {
		Total = total;
	}
	
}
