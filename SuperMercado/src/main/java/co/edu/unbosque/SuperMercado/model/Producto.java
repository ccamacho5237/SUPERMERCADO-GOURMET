package co.edu.unbosque.SuperMercado.model;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@Column(name ="codigo_pruducto", length = 20)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long codigo_producto;
	
	@Column(name="nombre_producto")
	private String nombre_producto;
	
	@Column(name="precio_compra")
	private float precio_compra;
	
	@Column(name="iva_compra")
	private float iva_compra;
	
	@Column(name="precio_venta")
	private float precio_venta;
	
	@Column(name="iva_venta")
	private float iva_venta;
	

	@ManyToOne(optional = false, cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "nit_proveedor",referencedColumnName = "nit_proveedor")
	private Proveedor unProveedor;

	public long getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public float getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(float precio_compra) {
		this.precio_compra = precio_compra;
	}

	public float getIva_compra() {
		return iva_compra;
	}

	public void setIva_compra(float iva_compra) {
		this.iva_compra = iva_compra;
	}

	public float getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}

	public float getIva_venta() {
		return iva_venta;
	}

	public void setIva_venta(float iva_venta) {
		this.iva_venta = iva_venta;
	}

	public Proveedor getUnProveedor() {
		return unProveedor;
	}

	public void setUnProveedor(Proveedor unProveedor) {
		this.unProveedor = unProveedor;
	}

	@Override
	public String toString() {
		return "Producto [codigo_producto=" + codigo_producto + ", nombre_producto=" + nombre_producto
				+ ", precio_compra=" + precio_compra + ", iva_compra=" + iva_compra + ", precio_venta=" + precio_venta
				+ ", iva_venta=" + iva_venta + ", unProveedor=" + unProveedor + "]";
	}
	
}
