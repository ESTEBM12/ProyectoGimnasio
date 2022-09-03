package beans;

import java.sql.Date;

public class Clientes {

    private int cod_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private int telefono_cliente;
    private String email_cliente;
    private int id_number_cliente;
    private String password_cliente;

    public Clientes(int cod_cliente, String nombre_cliente, String apellido_cliente, int telefono_cliente, String email_cliente, int id_number_cliente, String password_cliente) {
        this.cod_cliente = cod_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono_cliente = telefono_cliente;
        this.email_cliente = email_cliente;
        this.id_number_cliente = id_number_cliente;
        this.password_cliente = password_cliente;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public int getId_number_cliente() {
        return id_number_cliente;
    }

    public void setId_number_cliente(int id_number_cliente) {
        this.id_number_cliente = id_number_cliente;
    }

    public String getPassword_cliente() {
        return password_cliente;
    }

    public void setPassword_cliente(String password_cliente) {
        this.password_cliente = password_cliente;
    }

    @Override
    public String toString() {
        return "Gimnasio_Clientes{" + "cod_cliente=" + cod_cliente + ", nombre_cliente=" + nombre_cliente + ", apellido_cliente=" + apellido_cliente + ", telefono_cliente=" + telefono_cliente + ", email_cliente=" + email_cliente + ", id_number_cliente=" + id_number_cliente + ", password_cliente=" + password_cliente + '}';
    }

}
