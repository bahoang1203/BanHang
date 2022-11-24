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
    @Table(name = "customers", catalog = "market")
public class Customers {    

    
    @Id
    @Column(name = "CustomerID")
    public int CustomerID;
    @Column(name = "Password")
    private String Password;
    @Column(name = "Fullname")
    private String Fullname;
    @Column(name = "Address")
    private String Address;
    @Column(name = "City")
    private String City;
//    @OneToMany(mappedBy="customers")
//    private List<Order> listorder;
    
}
