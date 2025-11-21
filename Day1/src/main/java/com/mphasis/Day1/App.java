package com.mphasis.Day1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employee emp = new Employee();
        System.out.println(emp);
        emp.setEmpId(101);
        emp.setEmpName("Bhanu");
        emp.setDesg("SDE-1");
        emp.setMobile("9275252104");
        System.out.println(emp);
        Account ac = new Account(12154635, "Bhanu", "HSBC Bank", "Block J Dabri", "HSBC7BJD003");
        
        System.out.println(ac);
        
        		
    }
}
