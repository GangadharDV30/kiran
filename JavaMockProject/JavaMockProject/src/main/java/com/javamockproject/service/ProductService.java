package com.javamockproject.service;
import java.sql.SQLException;
import java.util.List;
import com.javamockproject.bean.Product;

public interface ProductService {
	List<Product> viewAllProducts()throws ClassNotFoundException,SQLException;
	public Product getProductByCode(String productCode)throws ClassNotFoundException,SQLException;
}
