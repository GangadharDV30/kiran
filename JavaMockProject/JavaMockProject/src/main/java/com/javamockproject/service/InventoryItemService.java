package com.javamockproject.service;
import java.sql.SQLException;
import com.javamockproject.bean.InventoryItem;

public interface InventoryItemService {
	public InventoryItem getInventoryItemByProductCode(String productCode) throws ClassNotFoundException,SQLException;
	public InventoryItem updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity)throws ClassNotFoundException, SQLException;
}
