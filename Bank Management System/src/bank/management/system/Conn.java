
package bank.management.system;

import java.sql.*;


public class Conn {
Connection c;
Statement s;
public Conn(){
    try{
        c=DriverManager.getConnection("jdbc:mysql:///bankApp","root","12345678");
        s=c.createStatement();
    }catch(Exception e)
    {
        System.err.println(e);
    }
}
}
