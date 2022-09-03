package test;

import beans.Listado_Membresias;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        // listarPelicula();
       // actualizarClientes(1, "terror/fantasia");
    }

    public static void actualizarClientes(int cod_cliente, String nombre_cliente) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE clientes SET cod_cliente = '" + nombre_cliente + "'WHERE cod_cliente = " + cod_cliente;
        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
    }

    public static void listarClientes() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM clientes";
        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String genero = rs.getString("genero");
                int copias = rs.getInt("copias");
                boolean novedad = rs.getBoolean("novedad");
                Listado_Membresias clientes = new Listado_Membresias(id, titulo, autor, genero, copias, novedad);
                System.out.println(clientes.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
    }
}
