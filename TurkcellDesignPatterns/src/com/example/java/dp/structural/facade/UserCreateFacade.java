package com.example.java.dp.structural.facade;

import com.example.java.dp.structural.adapter.BusCardPrinter;
import com.example.java.dp.structural.adapter.Customer;
import com.example.java.dp.structural.adapter.CustomerAdapter;
import com.example.java.dp.structural.adapter.Employee;
import com.example.java.dp.structural.adapter.EmployeeAdapter;
import com.example.java.dp.structural.adapter.Person;
import com.example.java.dp.structural.decorator.PersonNameDecorator1;
import com.example.java.dp.structural.decorator.PersonNameDecorator2;

public class UserCreateFacade {
	private CRM crm = new CRM();
	private ERP erp = new ERP();
	private Billing billing = new Billing();
	private BusCardPrinter busCardPrinter = new BusCardPrinter();

	public void create(final Person person) {
		this.crm.reserve(person);
		try {
			this.erp.save(person);
			this.billing.createBilling(person);
			this.crm.save(person);
			this.busCardPrinter.print(person);
		} catch (Exception e) {
			this.crm.rollback(person);
		}
	}

	public void create(final Customer customer) {
		Person person = new PersonNameDecorator1(new CustomerAdapter(customer));
		this.create(person);
	}

	public void create(final Employee employee) {
		Person person = new PersonNameDecorator2(new PersonNameDecorator1(new EmployeeAdapter(employee)));
		this.create(person);
	}

}
