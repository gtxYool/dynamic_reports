/**
 * 
 */
package com.guatex.dynamic_reports.entitites;

/**
 * @author Dylan Yool
 *
 */
public class Columna {
    public String name, dataType;
    public boolean allowNull;
    public int length;

    /**
     * @param name
     * @param length
     */
    public Columna(String name, int length) {
	super();
	this.name = name;
	this.dataType = "varchar";
	this.allowNull = true;
	this.length = length;
    }

    /**
     * @param name
     * @param dataType
     * @param allowNull
     * @param length
     */
    public Columna(String name, String dataType, boolean allowNull, int length) {
	super();
	this.name = name;
	this.dataType = dataType;
	this.allowNull = allowNull;
	this.length = length;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @return the dataType
     */
    public String getDataType() {
	return dataType;
    }

    /**
     * @return the allowNull
     */
    public boolean getAllowNull() {
	return allowNull;
    }

    /**
     * @return the length
     */
    public int getLength() {
	return length;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @param dataType the dataType to set
     */
    public void setDataType(String dataType) {
	this.dataType = dataType;
    }

    /**
     * @param allowNull the allowNull to set
     */
    public void setAllowNull(boolean allowNull) {
	this.allowNull = allowNull;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
	this.length = length;
    }

}
