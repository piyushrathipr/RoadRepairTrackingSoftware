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
public class entercomTest {
    
    public entercomTest() {
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
     * Test of main method, of class entercom.
     */
    @Test
    public void testMain() throws SQLException {
        System.out.println("main");
        String[] args = null;
        entercom.main(args);
        String resident="Rahul";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from complaints where resident = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,resident);
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
        entercom.main(args);
        String phone="9998887778";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from complaints where phone = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,phone);
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
        entercom.main(args);
        String roadid="15";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from complaints where roadid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,roadid);
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
        entercom.main(args);
        String locid="15";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from complaints where locid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,locid);
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
        entercom.main(args);
        String complaint="Noo";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="roadies";
            String DB_URL = "jdbc:mysql://localhost:3306/file?zeroDateTimeBehavior=convertToNull";
            conn = DriverManager.getConnection(DB_URL,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(entercom.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select * from complaints where complaint = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,complaint);
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