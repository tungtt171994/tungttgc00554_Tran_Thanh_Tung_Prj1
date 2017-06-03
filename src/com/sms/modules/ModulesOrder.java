package com.sms.modules;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


import com.sms.services.Json;
import com.sms.services.SwingUtils;
import com.sms.table.Table_Order;

public class ModulesOrder {
	public File dataFile;
	private List<Table_Order> items;
	//Order list:
	//3.1.Input data	
	public void inputData()
	{
		try 
		{
			items = Json.readList(dataFile, Table_Order.class);
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//3.2.Display data with total value
	public void displayDataWithToTalValue()
	{
		for(Table_Order ik: items)
			System.out.println(ik.ccode + " || " + ik.pcode + " || " + ik.quantity);
	}
	
	public void displayFigure(String title)
	{
			SwingUtils.showData(title, items);
	}
	//3.3.Sort  by pcode and ccode
	public void sortBy_pcode_and_ccode()
	{
		Collections.sort(items, (x,y) -> pcode_then_code(x,y));
		this.displayDataWithToTalValue();
	}
	private int pcode_then_code(Table_Order x, Table_Order y) {
		// TODO Auto-generated method stub
		int d = x.pcode.compareTo(y.pcode);
		if(d != 0) return d;
		
		return x.ccode.compareTo(y.pcode);
	}
}
