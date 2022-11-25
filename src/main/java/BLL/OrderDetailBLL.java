/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OrderDetailDAL;
import java.util.List;

/**
 *
 * @author CULI
 */
public class OrderDetailBLL {
    private OrderDetailDAL orderdetailDAL= new OrderDetailDAL();
    
    public List loadOrderDetail(){
        List list;
        list = orderdetailDAL.loadOrderDetail();
        return list;
    }
}
