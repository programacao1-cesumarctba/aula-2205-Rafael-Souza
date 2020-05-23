package com.github.faeldn.classes;

public abstract class Animal implements InterAnimal {
	protected String especie;
	protected String sexo;
	public String cacar;
	
	
	public String respirar() {
		return ("Animal Respirando.");
	}
	
	public String getCacar() {
		return cacar;
	}
	public void setCacar(String cacar) {
		this.cacar = cacar;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
			
}
