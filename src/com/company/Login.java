package com.company;

import java.sql.*;

public class Login {

    public Login() {
    }

    public static void login() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // connection to BDD
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devops_application", "root", "");
            Statement st = cn.createStatement();
            // get data from liste_appel table
            ResultSet rs = st.executeQuery("select * from liste_appel");
            // read and view database data
            while(rs.next()) {
                System.out.println(
                        "Nom : " + rs.getString("nom") + ", " + "Prenom : " + rs.getString("prenom") + ", " +
                                "Second prenom : " + rs.getString("second_prenom") + ", " +
                                "Âge : " + rs.getInt("age") + ", " +
                                "Classe : " + rs.getString("classe") + ", " +
                                "Spécialité : " + rs.getString("specialite") + ", " +
                                "Rang : " + rs.getInt("rang"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

}
