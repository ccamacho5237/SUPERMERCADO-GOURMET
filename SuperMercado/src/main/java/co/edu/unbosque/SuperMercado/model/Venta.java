package co.edu.unbosque.SuperMercado.model;

import javax.persistence.*;

@Entity
@Table(name = "venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codigo_venta")
	private Integer codigo_venta;
	
	@Column(name="iva_venta")
	private double iva_venta;
	
	@Column(name="valor_venta")
	private double valor_venta;
	
	@Column(name="total_venta")
	private double total_venta;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cedula_cliente",referencedColumnName = "cedula_cliente")
	private Cliente unCliente;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="cedula_usuario",referencedColumnName = "cedula_usuario")
	private Usuario unUsuario;

	public Integer getCodigo_venta() {
		return codigo_venta;
	}

	public void setCodigo_venta(Integer codigo_venta) {
		this.codigo_venta = codigo_venta;
	}

	public double getIva_venta() {
		return iva_venta;
	}

	public void setIva_venta(double iva_venta) {
		this.iva_venta = iva_venta;
	}

	public double getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}

	public double getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}

	public Cliente getUnCliente() {
		return unCliente;
	}

	public void setUnCliente(Cliente unCliente) {
		this.unCliente = unCliente;
	}

	public Usuario getUnUsuario() {
		return unUsuario;
	}

	public void setUnUsuario(Usuario unUsuario) {
		this.unUsuario = unUsuario;
	}

}
