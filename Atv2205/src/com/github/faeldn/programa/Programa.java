package com.github.faeldn.programa;

import com.github.faeldn.classes.Gato;

public class Programa {
	public static void main(String[] args) {
		Gato gato = new Gato ();
		gato.setEspecie("Gato");
		gato.setSexo("Macho");
		gato.setCor("Preto");
		gato.setTamanho(0.30);
		
		System.out.println("##### Gato #####");
        System.out.println("Esp�cie: "+ gato.getEspecie());
        System.out.println("Sexo: "+ gato.getSexo());
        System.out.println("Colora��o: " + gato.getCor());
        System.out.println("Tamanho: " + gato.getTamanho()+ " m");
        System.out.println("Ca�a: " + gato.getCacar());
        System.out.println(gato.respirar());
	}
}
