package org.iskycode.jeewe.adm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/l")
@Controller
public class LoginController {
    @RequestMapping("/tologin")
    public ModelAndView tologin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}
