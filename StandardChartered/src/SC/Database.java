/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;


public class Database 
{
    
    int result,r;
    
    
    int EmployeeLogin(String usernamee,String passworda)
    {
        try
        {
            
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("Select * from EmployeeInfo where UserName='"+usernamee+"' and Password='"+passworda+"' ");
            ///boolean b=stmt.execute("insert into UserLogin(UserName,Password)values('"+username+"','"+password+"')");
            //stmt.execute("Select * from student");
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Login succeded!");
                result=1;
            }
            else {JOptionPane.showMessageDialog(null, "Login failed");}
                
            
		//stmt.execute("update student set s_age=29 where s_age=28");
            	//stmt.execute("Delete from student where name='student3' and s_age=23");            	
           
            //###########//
            
              /*stmt.execute("Select * from student");            
            	ResultSet result= stmt.getResultSet();            
            	while(result.next())
            	{
                	System.out.println("Name: "+result.getString("name")+" Age: "+ result.getString("s_age"));
            	}*/
            
            //###########//
            
            	/*stmt.execute("Select count(*) as counter from student");
            	ResultSet rs= stmt.getResultSet();
            	rs.next();
            	int count = rs.getInt("counter");
            	System.out.println(count);*/
            
            //###########//
            
	    stmt.close();            
            con.close();
            
            //###########//
        } 
	catch (Exception err) {
            System.out.println("ERROR: " + err);
        }
         return result;
    }
   

    int CustomerLogin(String username,String password)
    {
        try
        {
            
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("Select * from CustomerInfo where UserName='"+username+"' and Password='"+password+"' ");
            ///boolean b=stmt.execute("insert into UserLogin(UserName,Password)values('"+username+"','"+password+"')");
            //stmt.execute("Select * from student");
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Login succeded!");
                result=1;
            }
            else {JOptionPane.showMessageDialog(null, "Login failed");}
                
            
		//stmt.execute("update student set s_age=29 where s_age=28");
            	//stmt.execute("Delete from student where name='student3' and s_age=23");            	
           
            //###########//
            
              /*stmt.execute("Select * from student");            
            	ResultSet result= stmt.getResultSet();            
            	while(result.next())
            	{
                	System.out.println("Name: "+result.getString("name")+" Age: "+ result.getString("s_age"));
            	}*/
            
            //###########//
            
            	/*stmt.execute("Select count(*) as counter from student");
            	ResultSet rs= stmt.getResultSet();
            	rs.next();
            	int count = rs.getInt("counter");
            	System.out.println(count);*/
            
            //###########//
            
	    stmt.close();            
            con.close();
            
            //###########//
        } 
	catch (Exception err) {
            System.out.println("ERROR: " + err);
        }
         return result;
    }
   
   
  int NewUserInformationInsert(String username,String password,String custname,String phone,String address,String sex,String nationalID)
        {
               
            try{
           
            
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            ResultSet rs=stmt.executeQuery("Select UserName from CustomerInfo where UserName='"+username+"' ");
            if(!rs.next())
            {
             
             boolean b=stmt.execute("insert into CustomerInfo(UserName,Password,CustomerName,Phone,Address,Sex,NationalID)values('"+username+"','"+password+"','"+custname+"','"+phone+"','"+address+"','"+sex+"','"+nationalID+"')");
             boolean c=stmt.execute("insert into CustomerReport(NationalID)values('"+nationalID+"')");
              JOptionPane.showMessageDialog(null, "Your Required Loan Has Been Added To Your Account!");
                result=1; 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "this Username already exitsts!Please input a unique username");
            }
            
            
             
	    stmt.close();            
            con.close();
                 
        } 
	catch (Exception err) 
        {
            System.out.println("ERROR: " + err);
        }
            
            return result;
        }
   
  
  
  
  
  
  int NewUserInformation(String username,String password,String custname,String phone,String address,String sex)
        {
               
            try{
           
            
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            ResultSet rs=stmt.executeQuery("Select UserName from EmployeeInfo where UserName='"+username+"' ");
            if(!rs.next())
            {
             
             boolean b=stmt.execute("insert into EmployeeInfo(UserName,Password,EmployeeName,Phone,Address,Sex)values('"+username+"','"+password+"','"+custname+"','"+phone+"','"+address+"','"+sex+"')");
            // boolean c=stmt.execute("insert into CustomerReport(NationalID)values('"+nationalID+"')");
              JOptionPane.showMessageDialog(null, "Registration is suceeded!");
                result=1; 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "this Username already exitsts!Please input a unique username");
            }
            
            
             
	    stmt.close();            
            con.close();
                 
        } 
	catch (Exception err) 
        {
            System.out.println("ERROR: " + err);
        }
            
            return result;
        }
   
  
  
  
  
  
  
  
  
  
  
  
  
  
int CustomerLoan(String TotalAccountBalance,String LoanAmount,String CustID, String PW)
  {   
           
    try
    {     
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            //int id=Integer.parseInt(CustID);
          ResultSet rs = stmt.executeQuery("Select NationalID from CustomerInfo where NationalID='"+CustID+"' and Password='"+PW+"' ");
          
          if(rs.next())
          {
                boolean b=stmt.execute("update CustomerReport set AccountBalance='"+TotalAccountBalance+"' where NationalID='"+CustID+"' ");
                 
               
                  JOptionPane.showMessageDialog(null, "Your Required Loan Has Been Added To Your Account!");
                
                  result=1; 

          }
          else{JOptionPane.showMessageDialog(null, "Your Required Loa falsent!");}
       stmt.close();            
       con.close();
            }  catch (Exception err) 
        {
            System.out.println("ERROR: " + err);
        }
        return result;
 }
          

int Customerdeposit(String nationalid, String deposit, String loan, String accountbalance,String password)
{

try
    {     
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            
          ResultSet rs = stmt.executeQuery("Select NationalID from CustomerInfo where NationalID='"+nationalid+"' and Password='"+password+"' ");
          
          if(rs.next())
          {
                boolean b=stmt.execute("update CustomerReport set AccountBalance='"+accountbalance+"' where NationalID='"+nationalid+"' ");
                boolean c=stmt.execute("update CustomerReport set Deposit='"+deposit+"' where NationalID='"+nationalid+"' ");
                boolean d=stmt.execute("update CustomerReport set Loan='"+loan+"' where NationalID='"+nationalid+"' ");
               JOptionPane.showMessageDialog(null, "Your Deposition Has Been Suceesfully done!");
               result=1; 

          }
          else{JOptionPane.showMessageDialog(null, "Your Password And National-Id did not Match! Give Input correctly.");
          }
          
          stmt.close();            
          con.close();
          
            }

       catch (Exception err) 
        {
            System.out.println("ERROR: " + err);
        }
        return result;
 }


int CustomerWithdraw(String accountbalance,String withdraw, String password,String nationalid)
{
    try
    {     
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            
          ResultSet rs = stmt.executeQuery("Select NationalID from CustomerInfo where NationalID='"+nationalid+"' and Password='"+password+"' ");
          
          if(rs.next())
          {
                boolean b=stmt.execute("update CustomerReport set Withdraw='"+withdraw+"' where NationalID='"+nationalid+"' ");
              boolean c=stmt.execute("update CustomerReport set AccountBalance='"+accountbalance+"' where NationalID='"+nationalid+"' ");
               JOptionPane.showMessageDialog(null, "Your Withdraw Has Been Suceesfully done!");
               result=1; 

          }
          else{JOptionPane.showMessageDialog(null, "Your Password And National-Id did not Match! Give Input correctly.");
          }
          
          stmt.close();            
          con.close();
          
            }

       catch (Exception err) 
        {
            System.out.println("ERROR: " + err);
        }
        return result;
  
}


//int deleteCustomer(String name,String nationalid)
//{
//    try
//        {
//            
//	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
//            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
//            Connection con = DriverManager.getConnection(connURL, "", "");
//            Statement stmt = con.createStatement();
//            
//            ResultSet rs = stmt.executeQuery("Delete from CustomerInfo where UserName='"+name+"' and NationalID='"+nationalid+"' ");
//            
//            if(rs.next())
//            {
//                ResultSet bs = stmt.executeQuery("Delete from CustomerReport where NationalID='"+nationalid+"' ");
//               
//                
//                JOptionPane.showMessageDialog(null, "Deletion succeded!");
//                    result = 1; 
//                
//               
//            }
//            else {JOptionPane.showMessageDialog(null, "Deletion failed");}
//                
//  
//            	//stmt.execute("Delete from student where name='student3' and s_age=23");            	
//           
//                      
//	    stmt.close();            
//            con.close();
//            
//            //###########//
//        } 
//	catch (Exception err) {
//            System.out.println("ERROR: " + err);
//        }
//         return result;
//
//
//}

int EditCust(String username, String password,String PUN, String PPW)

{
               
            try{
           
            
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "D:/Softe/Project SD/Bank/Main Bank/ProjectFile/StandardChartered/Fbank";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            ResultSet rs=stmt.executeQuery("Select UserName from CustomerInfo where UserName='"+PUN+"' and Password='"+PPW+"'");
            if(rs.next())
            {
             boolean b=stmt.execute("update CustomerInfo set UserName='"+username+"' where UserName='"+PUN+"' ");
              boolean c=stmt.execute("update CustomerInfo set Password='"+password+"' where Password='"+PPW+"' ");
              JOptionPane.showMessageDialog(null, "New Username and Password has been updated successfully!");
                result=1; 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Username and Password didnot match. Check Spelling.");
            }
            
            
             
	    stmt.close();            
            con.close();
                 
        } 
	catch (Exception err) 
        {
            System.out.println("ERROR: " + err);
        }
            
            return result;
        }





}


 
    



