package org.iskycode.jeewe.adm.web;

import org.iskycode.jeewe.adm.entity.AdmUser;
import org.iskycode.jeewe.adm.service.UserService;
import org.iskycode.jeewe.sys.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author phoenix
 *
 *         用户管理接口层
 */
@RequestMapping(Const.ADMIN_PATH + "/user")
@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/userList")
	public ModelAndView userList() {
		ModelAndView mav = new ModelAndView();
		List<AdmUser> userList = userService.findAll();
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).getName());
		}
		mav.addObject("userList", userList);
		mav.setViewName("index");
		return mav;
	}
}
