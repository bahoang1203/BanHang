/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HoangLAP
 */

@Data
@Entity
@Table(name = "Order",catalog = "market")
public class Order {
    @Id
    @Column(name = "OrderID")
    private int OrderID;
    @Column(name = "CustomerID")
    private int CustomerID;
    @Column(name = "Date")
    private String Date;
    @Column(name = "Total")
    private int Total;
    @Column(name = "Note")
    private String Note;
    
}
