package com.example.java.dp.project.customer.commands.processor;

import java.util.ArrayList;
import java.util.List;

import com.example.java.dp.project.customer.commands.ICommand;

public abstract class CustomerProcessor {
	private List<ICommand> commands = new ArrayList<>();

	public List<ICommand> getCommands() {
		return this.commands;
	}

}
