package jdbcexamples;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
*/
public class statement {

	public static void main(String[] args) throws Exception {
	//register driver with driver manager, will be done automatically
		//Class.forName("com.mysql.jdbc.Driver"); //load the .class file of driver
		
		//create connection/road
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
	//create statement/truck
		Statement st=con.createStatement();
		
		int result5=st.executeUpdate(" delete from employee  ");
		
		System.out.println("before inserting records:");
		displayRecords(st);
		
		
		//add query ( into truck) and send it for execution
		int result=st.executeUpdate("insert into employee values('laasya',10,400)");
		int result1=st.executeUpdate("insert into employee values('ravi',20,500)");
		int result2=st.executeUpdate("insert into employee values('laasya',30,600)");
		int result3=st.executeUpdate(" delete from employee where age=10 ");
		int result4=st.executeUpdate(" update employee set salary=50000 where name='ravi' ");
		int result7=st.executeUpdate("insert into employee values('laasya',30,600)");
		
		//gather the result
		System.out.println(result+" record added");
		System.out.println(result1+" record added");
		System.out.println(result2+" record added");
		System.out.println(result3+" record deleted");
		System.out.println(result4+" record updated");
		
		System.out.println("after inserting records:");
		displayRecords(st);
		
		//after inserting duplicate values to check select all
		System.out.println("after inserting duplicate records ");
		displayDuplicateRecords(st);
		
		//close the connection
		con.close();	
	}

	private static void displayDuplicateRecords(Statement st) throws SQLException {
ResultSet rs=st.executeQuery("select all name,age,salary from employee");
		
		if(rs.isBeforeFirst())
		{
			while(rs.next())
			{
			String name=rs.getString("name");
			int age=rs.getInt("age");
			int sal=rs.getInt("salary");
			System.out.println(name+" "+age+" "+sal);	
			}
		}
		else
			{
				System.out.println("No record found!!");	
			}
		}
		
	

	private static void displayRecords(Statement st) throws SQLException {
		ResultSet rs=st.executeQuery("select distinct * from employee");
		
		if(rs.isBeforeFirst())
		{
			while(rs.next())
			{
			String name=rs.getString("name");
			int age=rs.getInt("age");
			int sal=rs.getInt("salary");
			System.out.println(name+" "+age+" "+sal);	
			}
		}
		else
			{
				System.out.println("No record found!!");	
			}
		}
		
	}



