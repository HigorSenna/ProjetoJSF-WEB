package br.com.stefanini.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.stefanini.model.Funcionario;

@ManagedBean(name = "funcionarioController")
@ViewScoped
public class FuncionarioController {
	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> funcionarios = new ArrayList<>();

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void addFuncionario() {	
		funcionarios.add(funcionario);
		funcionario = new Funcionario();					
	}

	public List<Funcionario> pegarLista() {
		return funcionarios;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
