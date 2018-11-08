package edu.mum.cs.cs425.progmgmt;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.progmgmt.model.Product;
import edu.mum.cs.cs425.progmgmt.repository.IProductRepository;

@SpringBootApplication
public class MyProductMgmtAppApplication implements CommandLineRunner{

	
	//@Autowired
	IProductRepository  iproductRep;

	
	
	public MyProductMgmtAppApplication(IProductRepository iproductRep) {
		super();
		this.iproductRep = iproductRep;
	}

	public static void main(String[] args) {

	        
           SpringApplication.run(MyProductMgmtAppApplication.class, args);
	    
	}

		@Override
		public void run(String... args) throws Exception {

			iproductRep.save(new Product(1001,"iPhone XS Max",1500.00f, LocalDate.of(2018, 10, 24)));
			
			List<Product> products = (List<Product>) iproductRep.findAll();
			
			for(Product prod: products) {
				
				System.out.println(prod);
			}
			
				
	}
}
