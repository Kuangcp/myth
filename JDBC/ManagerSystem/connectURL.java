/**
 * 网上找到的代码！
 * 严重: 此驱动程序不支持 Java Runtime Environment (JRE) 1.8 版。请使用支持 JDBC 4.0 的 sqljdbc4.jar 类库。
 *   jdk不兼容！
 */
package ManagerSystem;

//=====================================================================
//
//File:    connectURL.java      
//Summary: This Microsoft JDBC Driver for SQL Server sample application
//	     demonstrates how to connect to a SQL Server database by using
//	     a connection URL. It also demonstrates how to retrieve data 
//	     from a SQL Server database by using an SQL statement.
//
//---------------------------------------------------------------------
//
//This file is part of the Microsoft JDBC Driver for SQL Server Code Samples.
//Copyright (C) Microsoft Corporation.  All rights reserved.
//
//This source code is intended only as a supplement to Microsoft
//Development Tools and/or on-line documentation.  See these other
//materials for detailed information regarding Microsoft code samples.
//
//THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF 
//ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO 
//THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
//PARTICULAR PURPOSE.
//
//===================================================================== 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectURL {

	public static void main(String[] args) {
		
		// Create a variable for the connection string.
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
			"databaseName=AdventureWorks;integratedSecurity=true;";

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
      	try {
      		// Establish the connection.
      		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          		con = DriverManager.getConnection(connectionUrl);
          
          		// Create and execute an SQL statement that returns some data.
          		String SQL = "SELECT TOP 10 * FROM Person.Contact";
           		stmt = con.createStatement();
          		rs = stmt.executeQuery(SQL);
          
          		// Iterate through the data in the result set and display it.
          		while (rs.next()) {
          			System.out.println(rs.getString(4) + " " + rs.getString(6));
          		}
      	}
      
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}

