package com.catalogserviceproject;
import java.sql.SQLException;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.catalogserviceproject.bean.Product;
import com.catalogserviceproject.service.ProductService;
import com.catalogserviceproject.service.ProductServiceImpl;

@Path("/products")
public class ProductResource {
	private ProductService productService=new ProductServiceImpl();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Product> listAllProducts(){
			try {
				return productService.viewAllProducts();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
//		@GET
//		@Produces(MediaType.APPLICATION_JSON)
//		public List<Product> listAllProducts(){
//			ProductList productList=new ProductList();
//			try {
//				List<Product> proList=productService.viewAllProducts();
//				productList.setProducts(proList);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		@Path("/code/{code}")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Product getProductByCode(@PathParam("code") String code) {
			try {
				return productService.getProductByCode(code);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return null;
		
		}
}

