/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import java.sql.SQLException;


/**
 *
 * @author Alumno
 */
public class testUsuario {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        FormLogin l= new FormLogin();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
       
        
    }
    
}
