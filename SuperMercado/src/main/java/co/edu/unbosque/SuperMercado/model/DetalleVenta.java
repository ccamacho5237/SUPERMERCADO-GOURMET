package co.edu.unbosque.SuperMercado.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "detalle_venta")
public class DetalleVenta {
	@Id
	@Column(name ="codigo_detalle_venta",length = 20)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo_detalle_venta;
	
	@Column(name="cantidad_producto",length = 11)
	private int cantidad_producto;
	
	@Column(name="valor_iva")
	private double valor_iva;
	
	@Column(name="valor_venta")
	private double valor_venta;
	
	@Column(name="valor_total")
	private double valor_total;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="codigo_producto",referencedColumnName = "codigo_pruducto")
	private Producto unProducto;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="codigo_venta",referencedColumnName = "codigo_venta")
	private Venta unaVenta;

	public long getCodigo_detalle_venta() {
		return codigo_detalle_venta;
	}

	public void setCodigo_detalle_venta(long codigo_detalle_venta) {
		this.codigo_detalle_venta = codigo_detalle_venta;
	}

	public int getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public double getValor_iva() {
		return valor_iva;
	}

	public void setValor_iva(double valor_iva) {
		this.valor_iva = valor_iva;
	}

	public double getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public Producto getUnProducto() {
		return unProducto;
	}

	public void setUnProducto(Producto unProducto) {
		this.unProducto = unProducto;
	}

	public Venta getUnaVenta() {
		return unaVenta;
	}

	public void setUnaVenta(Venta unaVenta) {
		this.unaVenta = unaVenta;
	}
	
}
