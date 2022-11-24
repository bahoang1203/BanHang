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
public class Customer {    
    @Id
    private int CustomerID;
    @Column
    private String Password;
    @Column
    private String Fullname;
    @Column
    private String Address;
    @Column
    private String City;
    @OneToMany(mappedBy="customers")
    private List<Order> listorder;
    
}
