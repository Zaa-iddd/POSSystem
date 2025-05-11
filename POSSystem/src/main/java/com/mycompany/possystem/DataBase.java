package com.mycompany.possystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    
    private Connection conn;
    
    public DataBase(Connection conn) {
        this.conn = conn;
    }

    public void createTable() {
        //String dropTable = "DROP TABLE IF EXISTS Products;";
        String createTable = """
                      CREATE TABLE IF NOT EXISTS Products (
                          id INT NOT NULL,
                          name TEXT NOT NULL,
                          price INT NOT NULL
                      );
                      """;

        try (Statement stmt = conn.createStatement()) {
            //stmt.executeUpdate(dropTable);
            stmt.executeUpdate(createTable);
            //System.out.println("Products table reset");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void addProduct(Product product) {
        String addProduct = """
        INSERT INTO Products (id, name, price)
        VALUES (?, ?, ?);
    """;

        try (PreparedStatement pstmt = conn.prepareStatement(addProduct)) {
            pstmt.setInt(1, product.getId());
            pstmt.setString(2, product.getName());
            pstmt.setDouble(3, product.getPrice());

            pstmt.executeUpdate();
            System.out.println("Product created successfully!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
