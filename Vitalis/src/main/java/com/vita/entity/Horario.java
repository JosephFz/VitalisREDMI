package com.vita.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_horario")
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_horario")
	private Integer codigo;

	@Column(name = "hora_horario")
	private String hora;

	@OneToMany(mappedBy = "horario")
	@JsonIgnore
	private List<Medico> listaMedico;

	@OneToMany(mappedBy = "horario")
	@JsonIgnore
	private List<Citas> listaCitas;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public List<Medico> getListaMedico() {
		return listaMedico;
	}

	public void setListaMedico(List<Medico> listaMedico) {
		this.listaMedico = listaMedico;
	}

	public List<Citas> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(List<Citas> listaCitas) {
		this.listaCitas = listaCitas;
	}

}
