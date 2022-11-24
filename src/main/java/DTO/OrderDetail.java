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
    @Id
    @Column(name = "VegetableID")
    private int VegetableID;
    @Column(name = "Quantity")
    private int Quantity;
    @Column(name = "Price")
    private int Price;
    
}
