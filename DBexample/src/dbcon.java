
import java.sql.*;
public class dbcon {
    dbcon(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionurl = "jdbc:mysql://localhost:3306/sampledb";
            Connection con = DriverManager.getConnection(connectionurl,"root","root");

            System.out.println("connection Success");
        }
        catch (Exception e){
            System.out.println("connection failed ..." + e);

        }
    }

    public static void main(String[] args) {
        dbcon obj = new dbcon();
    }
}
