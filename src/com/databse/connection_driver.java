/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.databse;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Omkar
 */
public class connection_driver {
    
    private static final connection_driver cd = new connection_driver();
    Connection con = null;
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public Connection getConnection(){
        return this.con;
    }
    
    public void createDatabaseConnection(String userName, String pass, connection_driver cdConn)
        {
        try {
            OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
            ds.setURL(DbConstants.DB_URL);
            String username = userName;
            String password = pass;
            Connection conn = ds.getConnection(username, password);
            cdConn.setConnection(conn);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    private connection_driver()
    {
        
    }
    
    public static connection_driver getConnectionDriver(){
        return cd;
    }
    
    
}
