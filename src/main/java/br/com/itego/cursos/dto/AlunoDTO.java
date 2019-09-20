package br.com.itego.cursos.dto;

import java.util.Date;

import br.com.itego.cursos.domain.Aluno;
import br.com.itego.cursos.domain.Cidade;
import br.com.itego.cursos.domain.Endereco;

//DTO fica apenas no resource
public class AlunoDTO {
	//Aluno
	private Double notaAdmissao;
	//Pessoa
	private String nome;
	private String cpf;
	private Date dtNasc;
	private String telefone;
	private String email;
	//Endereco
	private String cep;
	private String rua;
	private String complemento;
	private String numero;
	private String bairro;
	//Cidade
	private Integer cidade;
	//Método
	public static  Aluno dtoFromObj(AlunoDTO dto) {
		
		Aluno aluno = new Aluno();
		Endereco endereco = new Endereco();
		Cidade cidade = new Cidade();
		
		aluno.setNotaAdmissao(dto.getNotaAdmissao());
		aluno.setNome(dto.getNome());
		aluno.setCpf(dto.getCpf());
		aluno.setDtNasc(dto.getDtNasc());
		aluno.setTelefone(dto.getTelefone());
		aluno.setEmail(dto.getEmail());
		
		endereco.setCep(dto.getCep());
		endereco.setRua(dto.getRua());
		endereco.setComplemento(dto.getComplemento());
		endereco.setNumero(dto.getNumero());
		endereco.setBairro(dto.getBairro());
		cidade.setId(dto.getCidade());
		
		endereco.setCidade(cidade);
		aluno.setEndereco(endereco);
		endereco.setPessoa(aluno);
	
		return aluno;
	}
	
	
	public Double getNotaAdmissao() {
		return notaAdmissao;
	}
	public void setNotaAdmissao(Double notaAdmissao) {
		this.notaAdmissao = notaAdmissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public Integer getCidade() {
		return cidade;
	}
	public void setCidade(Integer cidade) {
		this.cidade = cidade;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
