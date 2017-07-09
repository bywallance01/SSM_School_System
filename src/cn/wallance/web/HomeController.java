package cn.wallance.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.wallance.domain.User;
import cn.wallance.service.IUserService;


@Controller
public class HomeController {
	private IUserService userService;
	
	
	public IUserService getUserService() {
		return userService;
	}

    @Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Model model){
		List<User> users = userService.selectAll();
		model.addAttribute("users", users);
		return "home";
	}

}
