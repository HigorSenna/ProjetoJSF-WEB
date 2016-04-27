package br.com.stefanini.controller;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.stefanini.model.Funcionario;

@ManagedBean
@ViewScoped
public class FuncionarioController{	
	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> listaFuncionarios;	

	public Funcionario getFuncionario() {
		return funcionario;
	}	

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}	
	
	public void addF(){
		listaFuncionarios.add(funcionario);		
	}
	
	public List<Funcionario> pegarLista(){
		return listaFuncionarios;
	}
	
}
