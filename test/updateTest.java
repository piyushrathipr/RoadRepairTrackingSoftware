/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Piyush Rathi
 */
public class updateTest {
    
    public updateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of showComplaints method, of class update.
     */
    @Test
    public void testMain1() throws SQLException {
        String[] args = null;
        update.main(args);
        String type="M1";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from resources where Type = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,type);
        ResultSet rs = pst.executeQuery();
        int t;
        if(rs.next()){
              t=1;
            } else {
               t=0;
            }
        conn.close();
        assertEquals(1,t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMain2() throws SQLException {
        String[] args = null;
        update.main(args);
        int unemp=198;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from resources where Unemployed = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,unemp);
        ResultSet rs = pst.executeQuery();
        int t;
        if(rs.next()){
              t=1;
            } else {
               t=0;
            }
        conn.close();
        assertEquals(1,t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMain3() throws SQLException {
        String[] args = null;
        update.main(args);
        int emp=2;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from resources where Employed = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,emp);
        ResultSet rs = pst.executeQuery();
        int t;
        if(rs.next()){
              t=1;
            } else {
               t=0;
            }
        conn.close();
        assertEquals(1,t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMain4() throws SQLException {
        String[] args = null;
        update.main(args);
        int total=200;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from resources where Total = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,total);
        ResultSet rs = pst.executeQuery();
        int t;
        if(rs.next()){
              t=1;
            } else {
               t=0;
            }
        conn.close();
        assertEquals(1,t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMain5() throws SQLException {
        String[] args = null;
        update.main(args);
        int unemp=97;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from resources where Unemployed = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,unemp);
        ResultSet rs = pst.executeQuery();
        int t;
        if(rs.next()){
              t=1;
            } else {
               t=0;
            }
        conn.close();
        assertEquals(1,t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of main method, of class update.
     */
    
    
}
