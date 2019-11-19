package com.training.turkcell.dp.creational.objectpooling;

import java.io.Closeable;

import com.training.turkcell.dp.structural.facade.JsonFacade;

public class Connection implements Closeable {
	private ConnectionPool connectionPool;

	public Connection(final ConnectionPool connectionPool) {
		this.connectionPool = connectionPool;
	}

	public void method1() {
		JsonFacade facade = new JsonFacade();
		facade.convertToJson(this.connectionPool);
	}

	@Override
	public void close() {
		this.connectionPool.add(this);
	}
}
