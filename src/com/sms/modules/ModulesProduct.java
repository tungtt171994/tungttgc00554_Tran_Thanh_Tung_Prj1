package com.sms.modules;

import java.io.File;
import java.util.List;

import com.sms.services.Json;
import com.sms.services.SwingUtils;
import com.sms.table.Table_Product;

public class ModulesProduct {
	public File dataFile;
	private List<Table_Product> items;
//	Product list:
//	1.1.Load data from file
	public void loadData()
	{
		try 
		{
			items = Json.readList(dataFile, Table_Product.class);
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
//	1.2.Input & add new item
	public void addItem(Table_Product tblProduct)
	{
		items.add(tblProduct);
	}
	public void addItem()
	{
		Table_Product tblPro = new Table_Product();
		tblPro.pcode = "PRDdemo";
		tblPro.pro_name = "New Product(demo)";
		tblPro.price = 1234.0;
		addItem(tblPro);
	}
//	1.3.Display data
	public void displayData()
	{
		for(Table_Product ik: items)
			System.out.println(ik);
		
	}
	public void displayDataSwing(String title)
	{
		SwingUtils.showData(title, items);
	}
//	1.4.Save product list to file
	public void saveProductListToFile()
	{
		
	}
//	1.5.Search by pcode
	public void searchBy_pcode()
	{
		
	}
//	1.6.Delete by pcode
	public void deleteBy_pCode(String pcode)
	{
		Table_Product tblPro = null;
		for(Table_Product ik: items)
			if(pcode.equals(pcode))
			{
				tblPro = ik;
				break;
			}
			if(tblPro != null)
				items.remove(tblPro);
	}
//	1.7.Sort by pcode
	public void sortBy_pcode()
	{
		
	}
//	1.8.Delete the node after the node having code = cCode
	public void del_after_pcode()
	{
		
	}

}
