/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernatebanhang.DAL;

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
@Table
public class Order {
    @Id
    private int OrderID;
    @Column
    private String Date;
    @Column 
    private int Total;
    @Column
    private String Note;
    
    @ManyToOne
    @JoinColumn(name="CustomerID")
    private Customer customers;
//    @ManyToMany(mappedBy="Order")
//    private List vegetable;
    
}
