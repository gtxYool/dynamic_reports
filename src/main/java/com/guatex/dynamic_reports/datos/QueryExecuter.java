package com.guatex.dynamic_reports.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class QueryExecuter extends Conexion {
    public static final Logger logger = LogManager.getLogger(QueryExecuter.class);
    private Connection con;
    private ResultSet rs;
    private PreparedStatement ps;

    public JSONArray executeQuery(String tabla, String columnas) {
	try {
	    con = getConnection();
	    String query = "SELECT " + columnas + " from " + tabla;
	    ps = con.prepareStatement(query);
	    System.out.println(query);
	    rs = ps.executeQuery();
	    String[] cols = columnas.split(",");
	    JSONArray jsa = new JSONArray();
	    while (rs.next()) {
		JSONObject jso = new JSONObject();
		for (int i = 0; i < cols.length; i++) {
		    jso.put(cols[i], notNull(rs.getString(i + 1)));
		}
		jsa.put(jso);
	    }
	    return jsa;
	} catch (Exception e) {
	    System.out.println("Algo salio sal " + e.toString());
	} finally {
	    CloseAll(con, ps, rs);
	}
	return null;
    }
}
