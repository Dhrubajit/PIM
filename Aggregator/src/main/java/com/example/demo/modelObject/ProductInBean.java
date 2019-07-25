package com.example.demo.modelObject;

public class ProductInBean {
	
	private String UUID;
	private String name;
	private String description;
	private String provider;
	private String available;
	private String messuermentUnit;
	
	public ProductInBean() {
	}
	
	public ProductInBean(String uUID, String name, String description, String provider, String available,
			String messuermentUnit) {
		UUID = uUID;
		this.name = name;
		this.description = description;
		this.provider = provider;
		this.available = available;
		this.messuermentUnit = messuermentUnit;
	}
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getMessuermentUnit() {
		return messuermentUnit;
	}
	public void setMessuermentUnit(String messuermentUnit) {
		this.messuermentUnit = messuermentUnit;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	
}
