package com.sms.modules;

import java.io.File;
import java.util.List;

import com.sms.services.Json;
import com.sms.services.SwingUtils;
import com.sms.table.Table_Customer;

public class ModulesCustomer 
{
	public File dataFile;
	private List<Table_Customer> items;
//	Customer list:
//	2.1.Load data from file
	public void loadData()
	{
		try 
		{
			items = Json.readList(dataFile, Table_Customer.class);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
//	2.2.Input & add new item
	public void addItem(Table_Customer tblCust)
	{
		items.add(tblCust);
	}
	public void addItem()
	{
		Table_Customer tblCust = new Table_Customer();
		tblCust.ccode = "CST123ddemo";
		tblCust.cus_name = "New Customer Demo";
		tblCust.phone = "0912345678";
		addItem(tblCust);
	}
//	2.3.Display data
	public void displayData()
	{
		for(Table_Customer ik: items)
			System.out.println(ik);
	}
	
	public void displayDataSwing(String title)
	{
		SwingUtils.showData(title, items);
	}
//	2.4.Save customer list to file
	public void saveCusList()
	{
		
	}
//	2.5.Search by ccode
	public void searchBy_cCode()
	{
		
	}
//	2.6.Delete by ccode
	public void deleteBy_cCode(String ccode)
	{
		Table_Customer tblCust = null;
		for(Table_Customer ik: items)
		if(ccode.equals(ccode))
		{
			tblCust = ik;
			break;
		}
		if(tblCust != null)
			items.remove(tblCust);
	}
}
