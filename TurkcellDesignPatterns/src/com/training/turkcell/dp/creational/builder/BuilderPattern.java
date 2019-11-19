package com.training.turkcell.dp.creational.builder;

public class BuilderPattern {
	private String name;
	private String surname;
	private String phone;
	private String fax;
	private int age;
	private BuilderPattern() {
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPhone() {
		return phone;
	}
	public String getFax() {
		return fax;
	}
	public int getAge() {
		return age;
	}
	public static BuilderPatternBuilder getBuilder() {
		return new BuilderPatternBuilder();
	}
	public static class BuilderPatternBuilder {
		private BuilderPattern bp = new BuilderPattern();
		private BuilderPatternBuilder() {
		}
		public BuilderPatternBuilder setPhone(String phone) {
			bp.phone = phone;
			return this;
		}
		public BuilderPatternBuilder setName(String name) {
			bp.name = name;
			return this;
		}
		public BuilderPatternBuilder setSurname(String surname) {
			bp.surname = surname;
			return this;
		}
		public BuilderPatternBuilder setAge(int age) {
			bp.age = age;
			return this;
		}
		public BuilderPatternBuilder setFax(String fax) {
			bp.fax = fax;
			return this;
		}
		public BuilderPattern build() {
			// Validation
			return bp;
		}
		public BuilderPattern buildForDatabase() {
			// Validation 2
			return bp;
		}
	}
	
	
}
