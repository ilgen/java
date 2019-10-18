package unex.java.spring;
import unex.java.spring.model.*;
// check name entered against permitted names allowed and return to message board if successful. otherwise try again.

import java.util.HashMap;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessagesController {
	
	private static final Logger logger = LoggerFactory.getLogger(MessagesController.class);
	
	private static HashMap<String, String> users = new HashMap<>();

	public MessagesController() {
		
        users.put("Rich", "test1");
        users.put("Lorenzo", "Test2");
        users.put("Joaquin", "test 3");
	
	}
	
	@RequestMapping(value="/messages", params= {"name", "message"}, method= {RequestMethod.GET, RequestMethod.POST})
	public String home(@RequestParam("name") String name, @RequestParam("message") String message, Model model, User user, HttpSession session) {
		logger.info("messages");
		
		if (users.containsKey(name)) {
			
			user = (User) session.getAttribute("name");
		    name = users.get(name);
		    session.setAttribute("name", name);
		    
		} else {
			
			model.addAttribute("404", "invalid name");
			logger.error("invalid name");
			return "index.jsp";
			
		} if (users.containsValue(message)) {
		   
		   user = (User) session.getAttribute("message");
           message = users.get(message);
		   session.setAttribute("message", message);
		   return "messages.jsp"; 
			
		}  else {
			
			model.addAttribute("404", "invalid message");
			logger.error("invalid message");
			return "index.jsp";
			
			}
	}
}