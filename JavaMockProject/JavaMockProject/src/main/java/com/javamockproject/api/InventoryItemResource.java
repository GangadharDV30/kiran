package com.javamockproject.api;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.javamockproject.bean.InventoryItem;
import com.javamockproject.service.InventoryItemService;
import com.javamockproject.service.InventoryItemServiceImpl;


// http://localhost:8085/InventoryServiceProject/webapi/inventoryItem/code/201
@Path("/inventoryItem")
public class InventoryItemResource {
	private InventoryItemService inventoryItemService=new InventoryItemServiceImpl();
		
		@Path("/code/{productCode}")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Response getProductByCode(@PathParam("productCode") String productCode) {
			
		InventoryItem inventoryItem=null;
			try {
				
				inventoryItem= inventoryItemService.getInventoryItemByProductCode(productCode);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return Response
		            .status(200)
		            .header("Access-Control-Allow-Origin", "*")
		            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
		            .header("Access-Control-Allow-Credentials", "true")
		            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
		            .header("Access-Control-Max-Age", "1209600")
		            .entity(inventoryItem)
		            .build();
		
		}
		
		@Path("/{productCode}/{avalableQuantity}")
		@POST
	    @Consumes(MediaType.TEXT_PLAIN)
//	    @Produces(MediaType.APPLICATION_JSON)
	    public Response updateInventoryItemQuantityByProductCode(@PathParam("productCode") String productCode,@PathParam("avalableQuantity") int avalableQuantity) 
	    {
			InventoryItem inventoryItem=null;
			try {
				
				inventoryItem= inventoryItemService.updateInventoryItemQuantityByProductCode(productCode, avalableQuantity);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return Response
		            .status(200)
		            .header("Access-Control-Allow-Origin", "*")
		            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
		            .header("Access-Control-Allow-Credentials", "true")
		            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
		            .header("Access-Control-Max-Age", "1209600")
		            .entity(inventoryItem)
		            .build();
	 }
	}

