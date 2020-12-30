/**
 * 
 */
package com.guatex.dynamic_reports.entitites;

import java.util.List;

/**
 * @author Dylan Yool
 *
 */
public class Tabla {
    public String nombre;
    public List<Columna> columnas;

    public Tabla() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
	return nombre;
    }

    /**
     * @return the columnas
     */
    public List<Columna> getColumnas() {
	return columnas;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    /**
     * @param columnas the columnas to set
     */
    public void setColumnas(List<Columna> columnas) {
	this.columnas = columnas;
    }

}
