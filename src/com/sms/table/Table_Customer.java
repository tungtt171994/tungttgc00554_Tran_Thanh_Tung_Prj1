package com.sms.table;

public class Table_Customer {
//	About a customer:
//		1.	ccode (string): the code of the customer (this should be unique for the customer).
	public String ccode;
//		2.	cus_name (string): the name of the customer.
	public String cus_name;
//		3.	phone (string): The phone number of the customer (must contain digits only).
	public String phone;
	@Override
	public String toString() {
		return "Table_Customer [ccode=" + ccode + ", cus_name=" + cus_name + ", phone=" + phone + "]";
	}

}
