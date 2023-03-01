import java.sql.*;
/*
 * Steps for connect jdbc
 * import --->java.sql
 * load and register driver
 * create connection 
 * create a statement
 * execute the query 
 * process the result
 * close
 */
public class DemoClass 
{
	
	public static void main(String[] args)throws Exception
	{
		String url ="jdbc:mysql://localhost:3306//sudarshan";
		String uname ="root";
		String pass = "1234";
		String Query = "select name from student where id =3";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		    //getConnection is method of java used to give instace of connection
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		
		rs.next();
		String name = rs.getNString("name");
		
		System.out.println(name);
		st.close();
		con.close();
		
	}

}
