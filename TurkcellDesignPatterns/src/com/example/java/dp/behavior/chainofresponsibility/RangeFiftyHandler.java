package com.example.java.dp.behavior.chainofresponsibility;

public class RangeFiftyHandler extends AbstarctHandlerChain {

	public RangeFiftyHandler(final AbstarctHandlerChain nextHandler) {
		super(nextHandler);
	}

	@Override
	public String handler(final int value) {
		if ((value > 0) && (value < 50)) {
			return "Value 0 ile 50 aras�nda";
		}
		return this.callNextHandler(value);
	}

}
