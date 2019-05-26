package com.generation.app.panaderia.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name ="usuarios")
public class Usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @NotEmpty
    private String nombreUsuario;
    @NotEmpty
    private String apellidoUsuario;
    @NotEmpty
    private String emailUsuario;
    @NotEmpty
    private String passwordUsuario;
    @NotEmpty
    private String PrivilegioUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getPrivilegioUsuario() {
        return PrivilegioUsuario;
    }

    public void setPrivilegioUsuario(String privilegioUsuario) {
        PrivilegioUsuario = privilegioUsuario;
    }

    public static final long serialVersionUID = 1L;
}
