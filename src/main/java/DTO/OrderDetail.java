/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HoangLAP
 */
    @Data    
    @Entity
    @Table(name = "OrderDetail",catalog="market")
public class OrderDetail implements Serializable {
    @Id
    @Column(name = "OrderID")
    private int OrderID;
    public int getOrderID() {
        return OrderID;
    }public void setOrderID(int orderID) {
        OrderID = orderID;
    }
	
    @Id
    @Column(name = "VegetableID")
    private int VegetableID;
    public int getVegetableID() {
        return VegetableID;
    }
    public void setVegetableID(int vegetableID) {
        VegetableID = vegetableID;
    }
	
    @Column(name = "Quantity")
    private int Quantity;
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
	
    @Column(name = "Price")
    private int Price;
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    
}
