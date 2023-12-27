package net.javaguides.springboot.web.dto;


public class EmergencyDto {
	private String description;
	private String Type;
	private String location;
	
	

	public EmergencyDto(String description, String Type, String location) {
		super();
		this.description = description;
		this.Type = Type;
		this.location = location;
	}

	public EmergencyDto() {
		// TODO Auto-generated constructor stub
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
}
