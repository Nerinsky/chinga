package com.example.demo.model;

public class Computadoras {
	private String NoSerie;
	private String Marca;
	private String Procesador;
	private String SistemaOperativo;
	private String Ram;
	private String NoNucleos;
		
	public Computadoras() {}
	
	public Computadoras(String NoSerie, String Marca,String Procesador, String SistemaOperativo, String Ram, String NoNucleos) {
		super();
		this.NoSerie = NoSerie;
		this.Marca = Marca;
		this.Procesador = Procesador;
		this.SistemaOperativo = SistemaOperativo;
		this.Ram = Ram;
		this.NoNucleos = NoNucleos;		
	}

	public String getNoSerie() {
		return NoSerie;
	}

	public void setNoSerie(String noSerie) {
		NoSerie = noSerie;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getProcesador() {
		return Procesador;
	}

	public void setProcesador(String procesador) {
		Procesador = procesador;
	}

	public String getSistemaOperativo() {
		return SistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
	}

	public String getRam() {
		return Ram;
	}

	public void setRam(String ram) {
		Ram = ram;
	}

	public String getNoNucleos() {
		return NoNucleos;
	}

	public void setNoNucleos(String noNucleos) {
		NoNucleos = noNucleos;
	}
	
	

}
