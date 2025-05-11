package com.mycompany.possystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        PosAdmin main = new PosAdmin();
        main.setVisible(true);
        
        Product product = new Product();
        Scanner scan = new Scanner(System.in);
        String url = "jdbc:sqlite:POS.db";

    }
}