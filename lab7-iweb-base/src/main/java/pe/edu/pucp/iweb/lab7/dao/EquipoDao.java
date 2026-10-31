package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab7.beans.EquipoRed;

public class EquipoDao extends BaseDao{ // TODO 2a: debe heredar de BaseDao

    /**
     * Ejercicio 2c: retorna los equipos de la sede indicada, ordenados por sede y modelo.
     * Si idSede es 0, retorna todos los equipos.
     *
     * Según la columna tipo, cree un objeto EquipoSwitch ('SWITCH') o EquipoAP ('AP').
     * Use PreparedStatement.
     */
    public ArrayList<EquipoRed> listarPorSede(int idSede) {
        ArrayList<EquipoRed> lista = new ArrayList<>();
        // TODO 2c

        try (Connection conn = this.getConnection();
            PreparedStatement pstmt = getConnection().prepareStatement();
            ResultSet rs = pstmt.executeQuery("INSERT INTO equipo (modelo,tipo,precio,cantidad,idsede) VALUES");){
            catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return lista;
    }
}
