
package beans;


public class Listado_Membresias {
    private int cod_membresia;
    private String nombre_membresia;
    private int valor_membresia;

    public Listado_Membresias(int cod_membresia, String nombre_membresia, int valor_membresia) {
        this.cod_membresia = cod_membresia;
        this.nombre_membresia = nombre_membresia;
        this.valor_membresia = valor_membresia;
    }

    public Listado_Membresias(int id, String titulo, String autor, String genero, int copias, boolean novedad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCod_membresia() {
        return cod_membresia;
    }

    public void setCod_membresia(int cod_membresia) {
        this.cod_membresia = cod_membresia;
    }

    public String getNombre_membresia() {
        return nombre_membresia;
    }

    public void setNombre_membresia(String nombre_membresia) {
        this.nombre_membresia = nombre_membresia;
    }

    public int getValor_membresia() {
        return valor_membresia;
    }

    public void setValor_membresia(int valor_membresia) {
        this.valor_membresia = valor_membresia;
    }

    @Override
    public String toString() {
        return "Listado_Membresias{" + "cod_membresia=" + cod_membresia + ", nombre_membresia=" + nombre_membresia + ", valor_membresia=" + valor_membresia + '}';
    }


    
}
