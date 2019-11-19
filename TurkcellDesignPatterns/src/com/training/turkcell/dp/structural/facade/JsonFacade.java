package com.training.turkcell.dp.structural.facade;

import com.google.gson.Gson;

public class JsonFacade implements IJsonFacade {

	public String convertToJson(final Object obj) {
		Gson gson = new Gson();
		return gson.toJson(obj);
	}

}
