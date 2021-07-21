
package controller;
import java.sql.SQLException;

public interface C_user {
    public boolean cekLogin(User u)throws SQLException;
}
