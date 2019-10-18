package unex.java.spring.model;

public class User {
	private String username;
	private String password;
	private String name;
	
	public User() {
		super();
	}
	public User(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}


	public String getUsername() {
		return username;
	}	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean checkPassword(String password) {
		if (this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

}