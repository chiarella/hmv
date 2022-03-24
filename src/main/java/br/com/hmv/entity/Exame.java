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
@Table(name = "tb_exame")
public class Exame implements Serializable {


	private static final long serialVersionUID = 2648988786327538018L;
	
	@Id
	@SequenceGenerator(name = "exame", 
	sequenceName = "sq_tb_exame", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_exame")
	private Long id;	
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	@Column(name = "descricao_exame")
	private String descricaoExame;
	
	@Column(name = "tipo_exame")
	private String tipoExame;
	
	@Column(name = "observacaoExane")	
	private String obersavacaoExame;
	

	public Exame() {
	}

	public Exame(Long id, Paciente paciente, String descricaoExame, String tipoExame, String obersavacaoExame) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.descricaoExame = descricaoExame;
		this.tipoExame = tipoExame;
		this.obersavacaoExame = obersavacaoExame;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getDescricaoExame() {
		return descricaoExame;
	}

	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getObersavacaoExame() {
		return obersavacaoExame;
	}

	public void setObersavacaoExame(String obersavacaoExame) {
		this.obersavacaoExame = obersavacaoExame;
	}

//	@Override
//	public String toString() {
//		return "Exame [id=" + id + ", paciente=" + paciente + ", descricaoExame=" + descricaoExame + ", tipoExame="
//				+ tipoExame + ", obersavacaoExame=" + obersavacaoExame + "]";
//	}
	
	
	
	
}
  