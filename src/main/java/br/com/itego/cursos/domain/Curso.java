package br.com.itego.cursos.domain;

public class Curso {

		private Integer id;
		private EnumTipoCurso tipoCurso;
		private String nome;
		private Double cargaHoraria;
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public EnumTipoCurso getTipoCurso() {
			return tipoCurso;
		}
		public void setTipoCurso(EnumTipoCurso tipoCurso) {
			this.tipoCurso = tipoCurso;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Double getCargaHoraria() {
			return cargaHoraria;
		}
		public void setCargaHoraria(Double cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}
		
		
		
		
		
		
}
