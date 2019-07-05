package br.edu.ifms.controller;
import br.edu.ifms.model.Interesse;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


	@ManagedBean(name = "professorBean")
	@RequestScoped
	public class ProfessorBean implements Serializable {

		private String nome;
		private String disciplina;
		private Date dataNascimento;
		private String periodo;
		private String login;
		private String senha;
		private String modalidade;
		private String descricao;
		private String faixaEtaria;
		
		
		private String curso;
		private String estado;
		private String cidade;
		
		private List<String> interesses = new ArrayList<String>();
		private static final long serialVersionUID = 1L;
	
		private String confirmarSenha;
		private List<String> estados = new ArrayList<String>();
		private List<String> cidades = new ArrayList<String>();
		
		public static final List<Interesse> INTERESSES = new ArrayList<Interesse>();
		
		static {
			INTERESSES.add(new Interesse("Programacaoo", "programacao"));
			INTERESSES.add(new Interesse("Ingles", "ingles"));
			INTERESSES.add(new Interesse("Mecanica", "mecanica"));
			INTERESSES.add(new Interesse("Filosofia", "filosofia"));
		}
		
		public List<String> completarTexto(String consulta) {
			List<String> resultados = new ArrayList<String>();
			
			if (consulta.startsWith("M")|| consulta.startsWith("m")) {
				resultados.add("Maria");
				resultados.add("Maria Santos");
				resultados.add("Mariana Santos Velasques");
				resultados.add("Marilene Filha do Jeferson");
			}
			
			return resultados;
		}
		
		
		public ProfessorBean() {
			estados.add("MG");
			estados.add("SP");
			estados.add("RJ");
		}
		
		public void carregarCidades() {
			cidades.clear();
			
			if ("MG".equals(estado)) {
				cidades.add("Uberlândia");
				cidades.add("Uberaba");
				cidades.add("Belo Horizonte");
			} else if ("SP".equals(estado)) {
	            cidades.add("São Paulo");
	            cidades.add("Franca");
	            cidades.add("Ribeirão Preto");
	        } else if ("RJ".equals(estado)) {
	            cidades.add("Rio de Janeiro");
	            cidades.add("Niteroi");
	        }
		}
		
		
		public void cadastrar() {
			System.out.println("Nome: " + this.nome);
			System.out.println("Displina: " + this.disciplina);
			System.out.println("Periodo: " + this.periodo);
			System.out.println("Login: " + this.login);
			System.out.println("Modalidade: " + this.modalidade);
			System.out.println("Curso: " + this.curso);
			System.out.println("Estado: " + this.estado);
			System.out.println("Cidade: " + this.cidade);
			System.out.println("Descricao: " + this.descricao);
			System.out.println("Código Faixa Etária: " + this.faixaEtaria);
			System.out.println("Interesses: " + this.interesses);
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
		}

		
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(String disciplina) {
			this.disciplina = disciplina;
		}

		public String getPeriodo() {
			return periodo;
		}

		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}
		
		public String getLogin() {
			return periodo;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getModalidade() {
			return modalidade;
		}

		public void setModalidade(String modalidade) {
			this.modalidade = modalidade;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}
		
		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		public String getCidade() {
			return estado;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getConfirmarSenha() {
			return confirmarSenha;
		}

		public void setConfirmarSenha(String confirmarSenha) {
			this.confirmarSenha = confirmarSenha;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public static List<Interesse> getInteresses() {
			return INTERESSES;
		}

		public Date getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
		public Date getDataHoje() {
			return new Date();
		}
		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getFaixaEtaria() {
			return faixaEtaria;
		}

		public void setFaixaEtaria(String faixaEtaria) {
			this.faixaEtaria = faixaEtaria;
		}
		

		public ProfessorBean(java.lang.String nome, java.lang.String disciplina, Date dataNascimento,
				java.lang.String periodo, java.lang.String login, java.lang.String senha, java.lang.String modalidade,
				java.lang.String curso, java.lang.String estado, java.lang.String cidade,
				java.lang.String confirmarSenha, List<java.lang.String> estados,List<java.lang.String> interesses,List<java.lang.String> cidades) {
			super();
			this.nome = nome;
			this.disciplina = disciplina;
			this.dataNascimento = dataNascimento;
			this.periodo = periodo;
			this.login = login;
			this.senha = senha;
			this.modalidade = modalidade;
			this.curso = curso;
			this.estado = estado;
			this.cidade = cidade;
			this.confirmarSenha = confirmarSenha;
			this.estados = estados;
			this.cidades = cidades;
		}
		
		
	}

	

