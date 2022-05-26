package com.proyecto.app.entidades;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="id", nullable = false, unique = true)
    private Long id;
    
    @Column(name="Codigo", nullable = false, unique = true)
    private Long codigo;
    
    @Column(name="Nombre", nullable = true, unique = false)
    private String nombre;
    
    @Column(name="Username", nullable = true, unique = false)
    private String username;
    
    @Column(name="Password", nullable = true, unique = false)
    private String password;
    
    @Column(name="Correo", nullable = true, unique = false)
    private String correo;
    
    @Column(name="Numero", nullable = true, unique = false)
    private String numero;
    
    @Column(name="Reservas", nullable = true, unique = false)
	@OneToMany()
    private List<Reserva> reservas;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Role rol;
        
    @ManyToMany()
    @Column(name="Restaurantes",nullable=true,unique=true)
    private List<Restaurante>restaurantes;
    
    public Cliente(){

    }
    
    public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre(){
        return nombre;
    }
	
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Role getRol() {
		return rol;
	}

	public void setRol(Role rol) {
		this.rol = rol;
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
    
}