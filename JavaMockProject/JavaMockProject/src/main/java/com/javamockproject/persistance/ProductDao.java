package com.javamockproject.persistance;
import java.sql.SQLException;
import java.util.List;
import com.javamockproject.bean.Product;

public interface ProductDao {
	public List<Product> listAllProducts()throws ClassNotFoundException,SQLException;
	public Product getProductByCode(String productCode)throws ClassNotFoundException,SQLException;
}
