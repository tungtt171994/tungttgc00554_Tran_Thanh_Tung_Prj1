package com.sms.modules;

import java.io.File;

import com.sms.services.Res;
import com.sms.table.Table_Product;

public class To_test_product_modules_add
{
	public static void main(String[] args) throws Exception {
		ModulesProduct modulesProduct = new ModulesProduct();
		modulesProduct.dataFile = Res.getDesktopFile("dsa2017-data/1e2/products.json");
		
		modulesProduct.loadData();
		
		Table_Product tblProduct = getSwingProduct();
		modulesProduct.addItem(tblProduct);
		
		modulesProduct.displayData();
		modulesProduct.displayDataSwing("Add New Product");
		
//		modulesProduct.deleteBy_pCode("PRDVSl0WFS");
//		modulesProduct.displayData();
//		modulesProduct.displayDataSwing("Delete Product By PCode");
		
	}

	private static Table_Product getSwingProduct() {
		// TODO Auto-generated method stub
		Table_Product tP = new Table_Product(); 
		tP.pcode = "PRD12312312";
		tP.pro_name = "Demo Add New Product";
		tP.price = 1234.0;
		return tP;
	}
	
	
	
	
}
