/**
 * Developer: Colin Ilgen
 * Class Package & Name: unex.java.messageapp
 * Purpose: JavaBean for MessageBoard
 */

package unex.java.spring.model;

public class MessageBean {

	private String name;
	private String message;

	
	public MessageBean(String name, String message) {
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageBean [name=" + name + ", message=" + message + "]";
	}


}
