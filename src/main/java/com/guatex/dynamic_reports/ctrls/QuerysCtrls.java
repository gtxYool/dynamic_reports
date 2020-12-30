package com.guatex.dynamic_reports.ctrls;

import java.sql.SQLException;

import org.json.JSONObject;
import com.guatex.dynamic_reports.datos.QueryExecuter;

public class QuerysCtrls {

    public QuerysCtrls() {
    }

    /**
     * 
     * @param JSONQuery
     * @return
     */
    public String RealizarConsulta(String JSONQuery) {
	if (!JSONQuery.isEmpty() && JSONQuery.length() > 5) {
	    JSONObject query = new JSONObject(JSONQuery);
	    String tabla = query.getString("tabla");
	    String columnas = query.getString("columnas");
	    if (verificarTablas(tabla)) {
		if (verificarColumnas(tabla, columnas)) {
		    String rsp = "";
		    rsp = new QueryExecuter().executeQuery(tabla, columnas).toString();
		    System.out.println(rsp);
		    return rsp;
		}
	    }
	}
	return "{\"codigo\":999}";
    }

    /**
     * 
     * @return
     */
    public boolean verificarTablas(String tabla) {
	return true;
    }

    /**
     * 
     * @return
     */
    public boolean verificarColumnas(String tabla, String columnas) {
	return true;
    }
}
