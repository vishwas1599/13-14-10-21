package com.dxc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.scan("com.dxc");
       context.refresh();
    
      Customer customer =(Customer) context.getBean("customer");
      customer.setCustId("100");
      customer.setCustName("Mythili");
      
      Address address =customer.getAddress();
      address.setDoorNo("17");
      address.setStreet("Brookfield street");
      address.setCity("Bangalore");
      address.setState("Karnataka");
      address.setPin("560032");
      
       System.out.println(customer);
       
       context.close();
    }
}
