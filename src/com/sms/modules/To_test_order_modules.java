package com.sms.modules;

import java.io.File;

import com.sms.services.Res;

public class To_test_order_modules {

	public static void main(String[] args) 
	{
		ModulesOrder modulesOrder = new ModulesOrder();
		modulesOrder.dataFile = Res.getDesktopFile("dsa2017-data/1e2/orders.json");
		//Input Data From File Json In My Desktop
		modulesOrder.inputData();
		//Show Data In Order List
		modulesOrder.displayDataWithToTalValue();
		modulesOrder.displayFigure("Before");
		//Sort Order by pCode and cCode
		modulesOrder.sortBy_pcode_and_ccode();
		modulesOrder.displayFigure("After");
	}

}
