package com.hackbulgaria.projectmanager;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Developer implements Runnable {
	private String name;
	private Skill skill;
	private List<Task> tasks;
	
	public Developer(String name, Skill skill, List<Task> tasks) {
		super();
		this.name = name;
		this.skill = skill;
		this.tasks = tasks;
	}

	public void assign(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public void run() {
		for (Task task : tasks) {
			double distraction = ThreadLocalRandom.current().nextDouble(1, 2);
		}
	}

}
