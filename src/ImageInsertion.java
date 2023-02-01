import java.sql.*;
import java.io.*;

public class ImageInsertion {
    public static void main(String [] args) throws FileNotFoundException, SQLException, ClassNotFoundException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nirmal", "root", "nnnnn11111");

        PreparedStatement s = con.prepareStatement("insert into images(name, image) values(?,?)");
        s.setString(1, "nirmal");     
        FileInputStream fis=new FileInputStream("nirmal.jpg");
        s.setBinaryStream(2, fis);
        s.executeUpdate();

        con.close();
    }
}
