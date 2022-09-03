package beans;

import java.sql.Date;

public class Membresia_Clientes {

    private int cod;
    private int cod_cliente;
    private int cod_membresia;
    private Date fecha_inscripcion;
    private int status;
    private int token;
    private Date fecha_token;

    public Membresia_Clientes(int cod, int cod_cliente, int cod_membresia, Date fecha_inscripcion, int status, int token, Date fecha_token) {
        this.cod = cod;
        this.cod_cliente = cod_cliente;
        this.cod_membresia = cod_membresia;
        this.fecha_inscripcion = fecha_inscripcion;
        this.status = status;
        this.token = token;
        this.fecha_token = fecha_token;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCod_membresia() {
        return cod_membresia;
    }

    public void setCod_membresia(int cod_membresia) {
        this.cod_membresia = cod_membresia;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public Date getFecha_token() {
        return fecha_token;
    }

    public void setFecha_token(Date fecha_token) {
        this.fecha_token = fecha_token;
    }

    @Override
    public String toString() {
        return "Membresia_Clientes{" + "cod=" + cod + ", cod_cliente=" + cod_cliente + ", cod_membresia=" + cod_membresia + ", fecha_inscripcion=" + fecha_inscripcion + ", status=" + status + ", token=" + token + ", fecha_token=" + fecha_token + '}';
    }

}
