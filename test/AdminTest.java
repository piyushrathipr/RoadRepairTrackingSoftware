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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of main method, of class Admin.
     */
    @Test
    public void testMain1() throws SQLException {
        String[] args = null;
        Admin.main(args);
        int comid=7;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from work where comid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,comid);
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
        Admin.main(args);
        int type=2;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from work where type = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,type);
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
        Admin.main(args);
        int priority=2;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from work where priority = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,priority);
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
        Admin.main(args);
        int m1=2;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from work where m1 = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,m1);
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
        Admin.main(args);
        int r1=5;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from work where r1 = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,r1);
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
    
}
