/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.databse;

/**
 *
 * @author Omkar
 */
public interface DbConstants {

	// DATABASE CONFIGURATION DETAILS
	public static final String DB_URL = "jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:acad111";
	public static final String DB_USERNAME = "ohatwal1";
	public static final String DB_PASSWORD = "Ralliyo1234";

	// SELECT QUERY
	public static final String DB_SELECT_QUERY = "SELECT * FROM students"; 
	
	// INSERT QUERY
//	public static final String InsertintoLogTable = "insert into logs values "; 
}
