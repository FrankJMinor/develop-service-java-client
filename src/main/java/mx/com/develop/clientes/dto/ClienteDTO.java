package mx.com.develop.clientes.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClienteDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "NOMBRES")
    private String nombres;

    @Column(name = "APEMAT")
    private String apellidoMaterno;

    @Column(name = "APEPAT")
    private String apellidoPaterno;

    @Column(name = "EDAD")
    private String edad;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "ID_DIRECCION")
    private String idDireccion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(String idDireccion) {
        this.idDireccion = idDireccion;
    }
}