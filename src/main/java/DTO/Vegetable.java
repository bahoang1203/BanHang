
package DTO;

import DTO.Category;
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
    @Column(name="VegetableID")
    private int VegetableID;
	public int getVegetableID() {
		return VegetableID;
	}

	public void setVegetableID(int vegetableID) {
		VegetableID = vegetableID;
	}
    @Column(name="VegetableName")
    private String VegetableName;
    public String getVegetableName() {
		return VegetableName;
	}

	public void setVegetableName(String vegetableName) {
		VegetableName = vegetableName;
	}
    @Column(name="Unit")
    private String Unit;
    public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}
    @Column(name="Amount")
    private int Amount;
    public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}
    @Column (name="Image")
    private String Image;
    public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
    @Column(name="Price")
    private Double Price;
    public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}
    @ManyToOne
    @JoinColumn(name="CatagoryID")
    private Category catagory;
    public Category getCatagory() {
		return catagory;
	}

	public void setCatagory(Category catagory) {
		this.catagory = catagory;
	}
    
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "OrderDetail", 
//            joinColumns = {@JoinColumn(name="VegetableID", nullable = false,updatable = false)}, 
//            inverseJoinColumns = {@JoinColumn(name="OrderID",nullable = false, updatable = false)})
//    private List order;
    
}
