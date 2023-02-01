import java.sql.*;
import java.util.Scanner;

public class Insertion {
	static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nirmal", "root", "nnnnn11111");

        PreparedStatement s = con.prepareStatement("insert into student values(?,?,?)");
      int count=0;
     
    	 System.out.println("enter id");
    	 int roll=sc.nextInt();
    	 System.out.println("enter name=");
    	String name=sc.next();
    	System.out.println("enter faculty");
    	String faculty=sc.next();
    	s.setInt(1, roll);
    	s.setString(2, name);
    	s.setString(3, faculty);
    	int r=s.executeUpdate();
    	count=count+r;
    	
    
     System.out.println("recourded added="+count);

        con.close();
   
}
}
