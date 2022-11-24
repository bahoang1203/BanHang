/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernatebanhang.DAL;

import DTO.Customers;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author CULI
 */
public class CustomerDAL {
    Session session;
    public CustomerDAL(){
        session = HibernateUtils.getSessionFactory().openSession();
    }
    public List loadCustomer(){
        List <Customers> listcustomer;
        session.beginTransaction();
        listcustomer = session.createQuery("From Customers", Customers.class).list();
        session.getTransaction().commit();
        for(Customers x : listcustomer){
            System.out.println(x.getCustomerID());
        }
        return listcustomer;
    }
    public static void main(String args[]){
        CustomerDAL dal = new CustomerDAL();
        dal.loadCustomer();
    }
}
