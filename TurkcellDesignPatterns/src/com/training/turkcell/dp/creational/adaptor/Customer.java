package com.training.turkcell.dp.creational.adaptor;

public class Customer extends Person {
	private String isim;
	private String soyisim;

	public String getIsim() {
		return this.isim;
	}

	public void setIsim(final String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return this.soyisim;
	}

	public void setSoyisim(final String soyisim) {
		this.soyisim = soyisim;
	}

	@Override
	public String getName() {
		return this.isim;
	}

	@Override
	public String getSurname() {
		return this.soyisim;
	}
}
