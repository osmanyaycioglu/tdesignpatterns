package com.training.turkcell.dp.behavioral.strategy.good;

import java.util.Random;

public class VurmaStratejisi {
	private int vurmaYuzdesi;

	public VurmaStratejisi(final int vurmaYuzdesi) {
		super();
		this.vurmaYuzdesi = vurmaYuzdesi;
	}

	public void atesEt(final int ekstra) {
		Random random = new Random();
		int nextInt = random.nextInt(100);
		if (nextInt <= (this.vurmaYuzdesi + ekstra)) {
			System.out.println("Vurdum");
		} else {
			System.out.println("Kacirdim");
		}
	}
}
