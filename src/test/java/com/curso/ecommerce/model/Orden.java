package com.curso.ecommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "ordenes")
public class Orden {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechaCracion;
	private Date fechaRecibida;
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne (mappedBy= "orden")
	private DetalleOrden detalleOrd;
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}

	public Orden(Integer id, String numero, Date fechaCracion, Date fechaRecibida, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCracion = fechaCracion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCracion() {
		return fechaCracion;
	}

	public void setFechaCracion(Date fechaCracion) {
		this.fechaCracion = fechaCracion;
	}

	public Date getFechaRecibida() {
		return fechaRecibida;
	}

	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	public DetalleOrden getDetalleOrd() {
		return detalleOrd;
	}

	public void setDetalleOrd(DetalleOrden detalleOrd) {
		this.detalleOrd = detalleOrd;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCracion=" + fechaCracion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}
	
	
}
