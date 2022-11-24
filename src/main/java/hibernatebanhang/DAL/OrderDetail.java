/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernatebanhang.DAL;

import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HoangLAP
 */
    @Data    
    @Table
public class OrderDetail {
    @Column
    private int Quantity;
    @Column
    private int Price;
    
}
