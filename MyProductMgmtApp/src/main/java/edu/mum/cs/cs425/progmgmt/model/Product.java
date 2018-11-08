package edu.mum.cs.cs425.progmgmt.model;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "productdb")
public class Product {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name = "product_id")
   private long pid;
   @Column(name = "product_Number")
   private long ProductNumber;
	@Column(name = "name")
    private  String name;
    @Column(name = "unit_price")
    private float unitPrice;
    @Column(name = "date_mfd")
    private LocalDate dateMfd;

    public Product(long ProductNumber, String name, float unitPrice,LocalDate dateMfd) {
        this.ProductNumber = ProductNumber;
        this.name = name;
        this.unitPrice = unitPrice;
        this.dateMfd=dateMfd;
    }

    public Product() {
    }

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getProductNumber() {
		return ProductNumber;
	}

	public void setProductNumber(long productNumber) {
		ProductNumber = productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public LocalDate getDateMfd() {
		return dateMfd;
	}

	public void setDateMfd(LocalDate dateMfd) {
		this.dateMfd = dateMfd;
	}
    
    

}
