
package hibernatebanhang.DAL;

import java.util.List;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author caothanh
 */
@Data
@Entity
@Table
public class Vegetable {
    
    @Id
    private int VegetableID;
    @Column 
    private String VegetableName;
    @Column
    private String Unit;
    @Column
    private int Amount;
    @Column 
    private String Image;
    @Column
    private Double Price;
    
    @ManyToOne
    @JoinColumn(name="CatagoryID")
    private Category catagory;
    
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "OrderDetail", 
//            joinColumns = {@JoinColumn(name="VegetableID", nullable = false,updatable = false)}, 
//            inverseJoinColumns = {@JoinColumn(name="OrderID",nullable = false, updatable = false)})
//    private List order;
    
}
