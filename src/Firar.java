
import java.sql.*;
class Firar{
    public static void main(String [] args)throws Exception{
       
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nirmal", "root", "nnnnn11111");

            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println("roll=" + rs.getInt(1) + "name=" + rs.getString(2) + "faculty=" + rs.getString(3));

            }

            con.close();
       
    }
}
