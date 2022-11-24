/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernatebanhang.DAL;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author HoangLAP
 */
public class OrderDAL {
    Session session;
    public OrderDAL(){
        session = HibernateUtils.getSessionFactory().openSession();
    }
    public List loadOrder(){
        List <Order> listorder;
        session.beginTransaction();
        listorder = session.createQuery("From Order", Order.class).list();
        session.getTransaction().commit();
        for(Order x : listorder){
            System.out.println(x.getOrderID());
        }
        return listorder;
    }
    public static void main(String args[]){
        OrderDAL dal = new OrderDAL();
        dal.loadOrder();
    }
}
