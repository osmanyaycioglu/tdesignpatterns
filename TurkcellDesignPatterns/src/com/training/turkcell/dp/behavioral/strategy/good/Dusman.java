package com.training.turkcell.dp.behavioral.strategy.good;

public class Dusman {
	int ekstraVurmaKapasitesi;
	private VurmaStratejisi as;

	public Dusman(final VurmaStratejisi as) {
		super();
		this.as = as;
	}

	public void atesEt() {
		this.as.atesEt(this.ekstraVurmaKapasitesi);
	}

	public void yuru() {
		System.out.println("Yuruyorum");
	}

	public void kos() {
		System.out.println("Kosuyorum");

	}

}
