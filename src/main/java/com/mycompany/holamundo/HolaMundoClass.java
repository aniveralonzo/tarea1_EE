/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamundo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 50232
 */
public class HolaMundoClass {
    public static void main(String[]args){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");

        Customer customer1 = (Customer) context.getBean("aniver");
        Customer customer2 = (Customer) context.getBean("alonzo");
        Cliente hola1 = (Cliente) context.getBean("crack1");
        Cliente hola2 = (Cliente) context.getBean("crack2");
        
        
        System.out.println(customer1);
        System.out.println(customer2);        
        System.out.println(hola1);
        System.out.println(hola2);        

        
/**        System.out.println("Hello world");
        
        Customer customer1= new Customer();
        customer1.setId(1L);
        customer1.setNombre("Alonzo");
        customer1.setCiudad("Ciudadrey");
        
        Customer customer2= new Customer();
        customer2.setId(2L);
        customer2.setNombre("nzo");
        customer2.setCiudad("Ciudadrey");
        
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
   **/
    }
    
}
