package java_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author molk tan
 * 2023/11/26
 */
public class JDBCExample {
    public static void main(String[] args) throws SQLException {

        // After Java 6, it is not necessary to explicitly load the database driver class.
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "user", "password");


        //But need to import the driver the jar or dependency
        //If not, it will throw No suitable driver found for jdbc:mysql://localhost/test
    }
}
