package com.example.java.dp.behavior.command;

import java.util.Scanner;

public interface ICommand {
	public String getMenuDesc();

	public void execute(Scanner scanner);
}
