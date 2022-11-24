/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import hibernatebanhang.DAL.Order;
import hibernatebanhang.DAL.OrderDAL;
import java.util.List;


/**
 *
 * @author HoangLAP
 */
public class OrderBLL {
    private OrderDAL orderDAL;
    public OrderBLL(){
        orderDAL = new OrderDAL();
    }
    public List loadOrder(){
        List list;
        list = orderDAL.loadOrder();
        return list;
    }
    public Object[][] convertList(List<Order> list)
    {
        int rows = list.size();
        int cols = 4;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = list.get(i).getOrderID();
            obj[i][1] = list.get(i).getCustomerID();
            obj[i][2] = list.get(i).getDate();
            obj[i][3] = list.get(i).getTotal();
            obj[i][4] = list.get(i).getNote();
        }
        return obj;
    }
}
