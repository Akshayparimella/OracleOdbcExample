      	import java.sql.Connection;// import java sqlConnection package
		import java.sql.DriverManager;//import java sql package
		import java.sql.PreparedStatement;//import sql prepared statement package
		import java.util.Scanner;//import java util package
		public class CreateOperation //class name
		{
		   public static void main(String[] args)//main method
			{
				int Employee_id; //variable initialization using integer data type of ,Employee id
				String Employee_name;//variable initialization using String  data type, Employee name
				String Employee_Designation;//variable initialization using String data type, Employee designation
				double Employee_salary;;//variable initialization using double data type, Employee salary
			    Scanner sc=new Scanner(System.in); //giving input, by creating an object called 
		        System.out.println("Enter Employee id"); //print statement of Employee id
		        Employee_id =sc.nextInt();//object of Employee id
		        System.out.println("Enter Employee name");//print statement of enter Employee name
		        Employee_name=sc.next();//object of Employee name
		        System.out.println("Enter Employee designation");//print statement of enter Employee designation
		        Employee_Designation=sc.next();//object of Employee designation
		        System.out.println("Enter Employee salary");//print statement of enter Employee salary
		        Employee_salary=sc.nextDouble();//object of Employee_salary
		        try //try exception handling block 
		        {
		        	Class.forName("oracle.jdbc.driver.OracleDriver");// oracle driver name
		        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");//get a connection
		        	String data="insert into Emp values(?,?,?,?)";
		        	PreparedStatement ps=con.prepareStatement(data); //obtain prepared statement select *from customer
		        	ps.setInt(1,Employee_id);//ps.setInt of Employee_id
		        	ps.setString(2,Employee_name);//ps.setstring Employee_name
		        	ps.setString(3,Employee_Designation);//ps.setstring Employee_designation
		        	ps.setDouble(4,Employee_salary);//ps.setstring Employee_salary
		            int i=ps.executeUpdate();
		            if(i==1)//if condition
		            {
		            	System.out.println("connection established successfully");//print and final statement if given statement is true
		            }
		            else //else block
		            {
		            	System.out.println("connection is not established successfully ");//print and final statement if given statement is false
		            }
		            }
			   catch(Exception e)//catch block exception handling
		        {
				   e.printStackTrace();
		        }
			    }
		        }




