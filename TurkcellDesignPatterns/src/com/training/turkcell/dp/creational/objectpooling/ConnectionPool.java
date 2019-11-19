package com.training.turkcell.dp.creational.objectpooling;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
	private BlockingQueue<Connection> conQueue = new ArrayBlockingQueue<>(
	                                                                      100);

	public ConnectionPool() {
		for (int i = 0; i < 100; i++) {
			this.conQueue.add(new Connection(
			                                 this));
		}
	}

	void add(final Connection connection) {
		this.conQueue.add(connection);
	}

	public Connection get() throws InterruptedException {
		return this.conQueue.take();
	}
}
