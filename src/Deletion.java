import java.sql.*;
import java.util.Scanner;

public class Deletion {
	static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nirmal", "root", "nnnnn11111");

        PreparedStatement s = con.prepareStatement("delete from student where name=?");
     System.out.println("enter name to delete");
     String n=sc.next();
     s.setString(1, n);
    	int r=s.executeUpdate();
    	System.out.println("deleted="+r);
    
   

        con.close();
   
}
}
