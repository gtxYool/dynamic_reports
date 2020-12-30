/**
 * 
 */
package com.guatex.dynamic_reports.entitites;

/**
 * @author Dylan Yool
 *
 */
public class Query {
	public String tableName;
	public String[] columnas;

	public Query() {
	}

	public Query(String tableName, String[] columnas) {
		setTableName(tableName);
		setColumnas(columnas);
	}

	public Query(String tableName, String columnas) {
		setTableName(tableName);
		setColumnas(columnas);
	}

	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @return the columnas
	 */
	public String[] getColumnas() {
		return columnas;
	}

	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @param columnas the columnas to set
	 */
	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	/**
	 * @param columnas the columnas to set
	 */
	public void setColumnas(String columnas) {
		this.columnas = columnas.split(",");
	}
}
