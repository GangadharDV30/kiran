package com.onlineshoping.service;

import com.onlineshoping.bean.Item;
import com.onlineshoping.bean.ItemList;

public interface CartService {
	public String createNewCart(String userName);
	public String addItomInCart(Item item);
	public String addItomsInCart(Item item);
	public ItemList getItomsFromCart(String userName);
	public String deleteItomFromCart(Item item);
	public String deleteItomsFromCart(Item item);
	public String deleteAllItomsFromCart(String userName);
}
