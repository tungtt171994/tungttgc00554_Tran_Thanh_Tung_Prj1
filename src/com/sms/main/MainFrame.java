package com.sms.main;

import com.sms.modules.ModulesCustomer;
import com.sms.modules.ModulesOrder;
import com.sms.modules.ModulesProduct;
import com.sms.services.MenuFrame;
import com.sms.services.Res;

public class MainFrame extends  MenuFrame
{
	protected ModulesProduct mnPro = new ModulesProduct();
	protected ModulesOrder mnOrder = new ModulesOrder();
	protected ModulesCustomer mnCus = new ModulesCustomer();
	
	public MainFrame()
	{
		this.setTitle("Sales Management Systems v1.0");
		//Menu Product
		super.menuPut("prod", newJMenu("Products",'P'));
		super.menuPut("prod/input", newJMenuItem("Load Data", 'L', 'L'),
			x -> mnPro.loadData());
		super.menuPut("prod/add", newJMenuItem("Add Product", 'A', 'A'),
			x -> mnPro.addItem());
		super.menuPut("prod/display", newJMenuItem("Display Data", 'D', 'D'),
				x -> mnPro.displayDataSwing("Products"));
		super.menuPut("prod/sort", newJMenuItem("Sort By PCode", 'S', 'S'),
				x -> mnPro.sortBy_pcode());
		super.menuPut("prod/delete", newJMenuItem("Remove Product", 'R', 'R'),
				x -> mnPro.deleteBy_pCode("pcode"));
		
		//Menu Customer
		super.menuPut("cust", newJMenu("Customers",'C'));
		super.menuPut("cust/input", newJMenuItem("Load Data", 'L', 'L'),
			x -> mnCus.loadData());
		super.menuPut("cust/add", newJMenuItem("Add Customer", 'C', 'C'),
			x -> mnCus.addItem());
		super.menuPut("cust/display", newJMenuItem("Display Data", 'D', 'D'),
			x -> mnCus.displayData());
		super.menuPut("cust/save", newJMenuItem("Save File", 'S', 'S'),
				x -> mnCus.saveCusList());
		super.menuPut("cust/search", newJMenuItem("Search By CCode", 'S', 'F'),
				x -> mnCus.searchBy_cCode());
		super.menuPut("cust/delete", newJMenuItem("Remove By CCode", 'R', 'R'),
				x -> mnCus.deleteBy_cCode("ccode"));
		
		
		
		//Menu Order
		super.menuPut("order", newJMenu("Orders",'O'));
		super.menuPut("order/input", newJMenuItem("Load Data", 'L', 'L'),
			x -> mnOrder.inputData());
		super.menuPut("order/display", newJMenuItem("Display Data", 'D', 'D'),
				x -> mnOrder.displayDataWithToTalValue());
		super.menuPut("order/search", newJMenuItem("Sort", 'S', 'S'),
				x -> mnOrder.sortBy_pcode_and_ccode());
		
		super.menuDump();

	}
	
	
	
	public static void main(String[] args) {
		MainFrame m = new MainFrame();
		m.mnPro.dataFile = Res.getDesktopFile("dsa2017-data/1e2/products.json");
		m.mnCus.dataFile = Res.getDesktopFile("dsa2017-data/1e2/customers.json");
		m.mnOrder.dataFile = Res.getDesktopFile("dsa2017-data/1e2/orders.json");
		
		m.setVisible(true);
	}

}
