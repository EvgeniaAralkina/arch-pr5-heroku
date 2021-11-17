package messagingstompwebsocket.Controllers;

import messagingstompwebsocket.Models.IdMessage;
import messagingstompwebsocket.Service.UserService;
import messagingstompwebsocket.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@MessageMapping("/hello")
	@SendTo("/topic/response")
	public User greeting(User user) throws Exception {
		System.out.println(user.toString());
		return userService.save(user);
	}

	@MessageMapping("/id")
	@SendTo("/topic/response")
	public User findOne(IdMessage id) throws Exception {
		System.out.println(id.toString());
		return userService.findById(id.getId());
	}
}