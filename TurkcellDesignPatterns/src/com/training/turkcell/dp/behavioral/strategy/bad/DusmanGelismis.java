package com.training.turkcell.dp.behavioral.strategy.bad;

import java.util.Random;

public class DusmanGelismis extends Dusman {

	private int vurmaYuzdesi;

	public DusmanGelismis(final int vurmaYuzdesi) {
		super();
		this.vurmaYuzdesi = vurmaYuzdesi;
	}

	@Override
	public void atesEt() {
		Random random = new Random();
		int nextInt = random.nextInt(100);
		if (nextInt <= this.vurmaYuzdesi) {
			System.out.println("Vurdum");
		} else {
			System.out.println("Kacirdim");
		}
	}
}
