package com.training.turkcell.dp.creational.adaptor;

public class EmployeePersonAdaptor extends Person {
	private Employee emp;

	public EmployeePersonAdaptor(final Employee emp) {
		this.emp = emp;
	}

	@Override
	public String getName() {
		return this.emp.getEmployeeName();
	}

	@Override
	public String getSurname() {
		return this.emp.getEmployeeSurname();
	}
}
