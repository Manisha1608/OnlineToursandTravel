package com.manisha.toursandtravels.utility;

import java.util.Comparator;

import com.manisha.toursandtravels.pojo.Customer;
public class SortCustomerByName implements Comparator<Customer>
{
	@Override
	public int compare(Customer cust1, Customer cust2) {
		return cust1.getCustName().compareToIgnoreCase(cust2.getCustName());
	}
}
