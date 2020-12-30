/**
 * @author DylanYool
 */
package com.guatex.dynamic_reports.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Conexion {
    public static final Logger logger = LogManager.getLogger(Conexion.class);
    Connection con;
    PreparedStatement cs;
    ResultSet rs;

    public Conexion() {

    }

    public Connection getConnection() {
	final String url = "jdbc:sqlserver://serverdbp;DatabaseName=OperacionesPrueba";
	final String user = "operaciones";
	final String pass = "gtxgtx01";
	con = null;
	try {
	    con = DriverManager.getConnection(url, user, pass);
	    logger.info("***Conexión exitosa***");
	} catch (Exception e) {
	    e.printStackTrace();
	    logger.info(" Conexión fallida, Algo malió sal... err: " + e.getMessage());
	}
	return con;
    }

    public void CloseAll(Connection con, PreparedStatement cs, ResultSet rs) {
	try {
	    if (rs != null) {
		rs.close();
		rs = null;
	    }
	    if (cs != null) {
		cs.close();
		cs = null;
	    }
	    if (con != null) {
		con.close();
		con = null;
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	    logger.info("\n No se pudo cerrar todo, Algo malió sal... err: " + e.getMessage() + "\n");
	}
    }

    public String notNull(String val) {
	return val != null ? val.trim() : "";
    }

}
