package the.scholar;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

    public static Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:Scholar.sqlite");
            return conn;
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            // JOptionPane.showMessageDialog(null, e);
            OptionDisplay op = new OptionDisplay();
            String error = e.getMessage();
            op.dbFailed(error);
            return null;
        }

    }

    public static void main(String[] args) {
        connect();
    }
}
