/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.OrderDetail;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author HoangLAP
 */
public class OrderDetailDAL {
    Session session;
    public OrderDetailDAL(){
    session = HibernateUtils.getSessionFactory().openSession();
    }
    public List loadOrderDetail(){
        List<OrderDetail> orderdetail;
        session.beginTransaction();
        orderdetail = session.createQuery("From OrderDetail", OrderDetail.class).list();
        session.getTransaction().commit();
        return orderdetail;
    }
    
}
