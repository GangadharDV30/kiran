package com.javamockproject.persistance;

import java.sql.SQLException;
import com.javamockproject.bean.InventoryItem;

public interface InventoryItemDao {
	public InventoryItem getInventoryItemByProductCode(String productCode) throws ClassNotFoundException,SQLException;
	public int updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity)throws ClassNotFoundException,SQLException;
}
