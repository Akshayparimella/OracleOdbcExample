import java.sql.Connection;// java.sql.Connection data sources import package
import java.sql.DriverManager;// java.sql.driver manager data sources import package
import java.sql.ResultSet;// java.sql.result set  data sources  package
import java.sql.Statement;// java.sql.Statement data sources import package
public class ReadOperation//class name
{
public static void main(String[] args) //main method
{
	int Employee_id; //variable initialization using integer data type of ,Employee id
	String Employee_name;//variable initialization using String  data type, Employee name
	String Employee_Designation;//variable initialization using String data type, Employee designation
	double Employee_salary;;//variable initialization using double data type, Employee salary
try //try block providing details ,related statements and objects here
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
    String sql="select *from Employee";// presenting a my sql query of create database table name
    Statement st=con.createStatement();//sql statement object for sending sql Statement object(st)=con.createStatement
    ResultSet rs=st.executeQuery(sql);//execute the given sql statements result set object execute query
    while(rs.next())//while condition rs(result set).next
{
	Employee_id=rs.getInt(1);//retrieves the value get customer_id
	Employee_name=rs.getString(2);//retrieves the value get customer_name//
	Employee_Designation=rs.getString(3);//retrieves the value get customer_email//
	Employee_salary=rs.getDouble(4);//retrieves the value get customer_mobile//
	System.out.println(Employee_id+"\t"+Employee_name+"\t"+Employee_Designation+"\t"+Employee_salary+"\t");
}
}
catch(Exception e)//catch block Exception handling check any run time errors are raised from try block
{
	e.printStackTrace();//e.printStackTrace
}
finally //final block
{
	System.out.println("program end");// print final statement 
}
}
}

