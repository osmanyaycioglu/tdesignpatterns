package com.example.java.dp.behavior.chainofresponsibility;

public class RangeFiftyToHundredHandler extends AbstarctHandlerChain {

	public RangeFiftyToHundredHandler(final AbstarctHandlerChain nextHandler) {
		super(nextHandler);
	}

	@Override
	public String handler(final int value) {
		if ((value > 50) && (value < 100)) {
			return "Value 50 ile 100 aras�nda";
		}
		return this.callNextHandler(value);
	}

}
