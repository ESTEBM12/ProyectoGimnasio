package test;

import beans.Listado_Membresias;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        listarListado_membresias();
        //actualizarClientes(1, "terror/fantasia");
    }

    public static void actualizarListado_membresias(int cod_cliente, String nombre_cliente) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE listado_membresias cod_membresia = '" + nombre_cliente + "'WHERE cod_cliente = " + cod_cliente;
        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
    }

    public static void listarListado_membresias() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM listado_membresias";
        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int cod_membresia = rs.getInt("cod_membresia");
                String nombre_membresia = rs.getString("nombre_membresia");
                int valor_membresia = rs.getInt("valor_membresia");
                Listado_Membresias listado_membresias = new Listado_Membresias(cod_membresia, nombre_membresia, valor_membresia);
                System.out.println(listado_membresias.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
    }
}
