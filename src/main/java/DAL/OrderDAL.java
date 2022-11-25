/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Order;
import java.util.ArrayList;
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
    public ArrayList loadOrder(){
        ArrayList <Order> listorder;
        session.beginTransaction();
        listorder = (ArrayList<Order>) session.createQuery("From Order", Order.class).list();
        session.getTransaction().commit();
        for(Order x : listorder){
            System.out.println(x.getDate());
        }
        return listorder;
    }
    //select category0_.CatagoryID as Catagory1_0_, category0_.Description as Descript2_0_, category0_.Name as Name3_0_ from Category category0_
    //select order0_.OrderID as OrderID1_2_, order0_.CustomerID as Customer2_2_, order0_.Date as Date3_2_, order0_.Note as Note4_2_, order0_.Total as Total5_2_ from Order order0_
}
