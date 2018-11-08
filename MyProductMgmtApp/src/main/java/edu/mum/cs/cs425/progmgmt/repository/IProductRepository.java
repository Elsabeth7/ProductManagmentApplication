package edu.mum.cs.cs425.progmgmt.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.progmgmt.model.Product;

@Repository
@Qualifier
public interface IProductRepository extends CrudRepository<Product, Long> {
	

}
