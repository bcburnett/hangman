/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author brian
 */
public class PhraseDatabase {
   public static void connect() {
        Connection conn = null;
        try {
          try {
            // db parameters
            Class.forName("org.sqlite");
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(PhraseDatabase.class.getName()).log(Level.SEVERE, null, ex);
          }
            String url = "jdbc:sqlite:data/phrase.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
   
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}
