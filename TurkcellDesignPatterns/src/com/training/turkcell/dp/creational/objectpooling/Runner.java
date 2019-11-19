package com.training.turkcell.dp.creational.objectpooling;

public class Runner {
	public static void main(final String[] args) {

		ConnectionPool connectionPool = new ConnectionPool();
		try (Connection connection = connectionPool.get()) {
			connection.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
