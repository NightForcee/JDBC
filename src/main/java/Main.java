import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDAO jdbc = new UserDAO();
        User userArtem = new User(1,"Artem", "artemslidenko@gmail.com", "Minsk");
        User userAlex = new User(2,"Alexei", "alexei@gmail.com", "Minsk");
        User userYaraslav = new User(3,"Yaraslav", "yaraslav@gmail.com", "Minsk");
        User userVadim = new User(4,"Vadim", "vadim@gmail.com", "Minsk");
        User userUra = new User(5,"Ura", "ura@gmail.com", "Minsk");

        jdbc.insertUser(userArtem);
        jdbc.insertUser(userAlex);
        jdbc.insertUser(userYaraslav);
        jdbc.insertUser(userVadim);
        jdbc.insertUser(userUra);
        userArtem.setCountry("Belarus Minsk");
        System.out.println(userArtem.getCountry());
        System.out.println(jdbc.updateUser(userArtem));

        jdbc.deleteUser(48);
        jdbc.deleteUser(49);
        jdbc.deleteUser(50);
        System.out.println(jdbc.selectAllUsers());
        System.out.println("SELECT " + jdbc.selectUser(96));
    }
}
