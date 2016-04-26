package br.com.stefanini.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PrincipalController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int numero ;
	
	public PrincipalController() {
		System.out.println("");
	}

	public void incrementar() {
		numero++;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
