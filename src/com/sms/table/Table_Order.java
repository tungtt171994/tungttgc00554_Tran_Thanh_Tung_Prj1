package com.sms.table;

public class Table_Order {
//	About ordering:
//		1.	pcode (string): the code of the product to be ordered.
	public String pcode;
//		2.	ccode (string): the code of the customer.
	public String ccode;
//		3.	quantity (integer): the number of  ordered products.
	public Integer quantity;
	@Override
	public String toString() {
		return "Table_Order [pcode=" + pcode + ", ccode=" + ccode + ", quantity=" + quantity + "]";
	}

}
