/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;
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
    //hoa don id
    @Id
    @Column(name = "OrderID")
    private int OrderID;
    public int getOrderID() {
            return OrderID;
    }
    public void setOrderID(int orderID) {
            OrderID = orderID;
    }
    //khach hang id
    @Column(name = "CustomerID")
    private int CustomerID;
    public int getCustomerID() {
            return CustomerID;
    }
    public void setCustomerID(int customerID) {
            CustomerID = customerID;
    }
    //ngay lap
    @Column(name = "Date")
    private LocalDate Date;
    public LocalDate getDate() {
            return Date;
    }
    
    public void setDate(LocalDate date) {
            Date = date;
    }
    //Thanh tien
    @Column(name = "Total")
    private int Total;
    public int getTotal() {
            return Total;
    }
    public void setTotal(int total) {
            Total = total;
    }
    //Note
    @Column(name = "Note")
    private String Note;
    public String getNote() {
            return Note;
    }
    public void setNote(String note) {
            Note = note;
    }
}
