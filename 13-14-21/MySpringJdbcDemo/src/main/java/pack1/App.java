package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
      ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
      
      EmployeeDAO empdao =(EmployeeDAO) context.getBean("employeeDAO");
      
      Employee  emp = (Employee)context.getBean("employee");
      emp.setEmployeeId(1002);
      emp.setEmployeeName("Darshan");
      emp.setSalary(70000);
      empdao.insert(emp);
      System.out.println("One record inserted");
    	
    	
    }
}
