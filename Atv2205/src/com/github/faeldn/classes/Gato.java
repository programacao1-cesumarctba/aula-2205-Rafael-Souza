package com.github.faeldn.classes;

public class Gato extends Animal{
	protected String cor;
	protected float tamanho;
	
	@Override
	public String getCacar() {
		super.setCacar("Caçando ratos."); 
		return super.getCacar();
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(double d) {
		this.tamanho = (float) d;
	}

	
}
