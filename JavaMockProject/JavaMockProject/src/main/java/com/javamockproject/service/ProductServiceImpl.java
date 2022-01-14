package com.javamockproject.service;
import java.sql.SQLException;
import java.util.List;
import com.javamockproject.bean.Product;
import com.javamockproject.persistance.ProductDao;
import com.javamockproject.persistance.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	ProductDao productDao=new ProductDaoImpl();
	
	@Override
	public List<Product> viewAllProducts() throws ClassNotFoundException, SQLException {
		
		return productDao.listAllProducts();
	}

	@Override
	public Product getProductByCode(String productCode) throws ClassNotFoundException, SQLException {
		Product product=productDao.getProductByCode(productCode);
		return product;
	}

	

}
