package org.iskycode.jeewe.adm.web;

import org.iskycode.jeewe.sys.util.Const;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(Const.LOGIN_PATH)
@RestController
public class LoginController {

    @RequestMapping("/tologin")
    public ModelAndView tologin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}
