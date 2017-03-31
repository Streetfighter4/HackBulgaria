package com.hackbulgaria.projectmanager;

public class ProjectManaget {
	public static void main(String[] args) {
		double patience = 1.5;
		
		if (args.length > 0) {
			try {
				patience = Double.parseDouble(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Patience must a double");
			}
		}
		
		Developer pesho = new Developer("Pesho", Skill.JUNUIR, tasks)
	}
}
