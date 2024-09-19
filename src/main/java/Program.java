import com.example.Config.mydb;
import com.example.DAO.UserDaoImpl;
import com.example.Model.UserModel;
import com.example.Service.UserService;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        UserService user = new UserService();
        System.out.println(user.findByUsername("1"));
    }
}
