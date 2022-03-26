package br.com.hmv.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Builder
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "tb_doenca")
public class Doenca implements Serializable {

	private static final long serialVersionUID = 3632911933421558759L;

	@Id
	@SequenceGenerator(name = "doenca", sequenceName = "sq_tb_doenca", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_doenca")
	private Long idDoenca;

	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	@Column(name = "descricao_doenca")
	private String descricaoDoenca;

	@Column(name = "status_doenca")
	private Boolean statusDoenca;

	@Column(name = "observacao_doenca")
	private String observacaoDoenca;
	
	public Doenca() {
	}

	public Doenca(Long idDoenca, Paciente paciente, String descricaoDoenca, Boolean statusDoenca,
			String observacaoDoenca) {
		this.idDoenca = idDoenca;
		this.paciente = paciente;
		this.descricaoDoenca = descricaoDoenca;
		this.statusDoenca = statusDoenca;
		this.observacaoDoenca = observacaoDoenca;
	}

	public Boolean getStatusDoenca() {
		return statusDoenca;
	}

	public void setStatusDoenca(Boolean statusDoenca) {
		this.statusDoenca = statusDoenca;
	}

	public Long getIdDoenca() {
		return idDoenca;
	}

	public void setIdDoenca(Long idDoenca) {
		this.idDoenca = idDoenca;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getDescricaoDoenca() {
		return descricaoDoenca;
	}

	public void setDescricaoDoenca(String descricaoDoenca) {
		this.descricaoDoenca = descricaoDoenca;
	}

	public String getObservacaoDoenca() {
		return observacaoDoenca;
	}

	public void setObservacaoDoenca(String observacaoDoenca) {
		this.observacaoDoenca = observacaoDoenca;
	}

}
