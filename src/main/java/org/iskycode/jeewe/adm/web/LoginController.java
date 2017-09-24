package org.iskycode.jeewe.adm.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.iskycode.jeewe.adm.entity.AdmUser;
import org.iskycode.jeewe.adm.service.UserService;
import org.iskycode.jeewe.sys.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RequestMapping(Const.LOGIN_PATH)
@RestController
public class LoginController {

    @Autowired
    private SecurityManager securityManager;

    @Autowired
    private UserService userService;

    @RequestMapping("/tologin")
    public String tologin() {
        return Const.COMMON_JSP + "/login";
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @RequestMapping(value = "/login")
    public ModelAndView login(String username, String password) {
        Map map = new HashMap<String, String>();
        ModelAndView mav = new ModelAndView();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            map.put("status", "faied");
            map.put("msg", "用户名和密码不能为空");
            mav.addObject("detail", map);
            return mav;
        }

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (IncorrectCredentialsException ice) {
            // 捕获密码错误异常
            map.put("status", "failed");
            map.put("msg", "密码错误");
            mav.addObject("detail", map);
            return mav;
        } catch (UnknownAccountException uae) {
            // 捕获未知用户名异常
            map.put("status", "failed");
            map.put("msg", "用户不存在");
            mav.addObject("detail", map);
            return mav;
        } catch (ExcessiveAttemptsException eae) {
            // 捕获错误登录过多的异常
            map.put("status", "failed");
            map.put("msg", "请稍后再试");
            mav.addObject("detail", map);
            return mav;
        }
        map.put("status", "success");
        map.put("msg", "登录成功");
        mav.addObject("detail", map);
        return mav;
    }

    @RequestMapping(value = "toregister")
    public String toRegister() {
        return Const.COMMON_JSP + "register";
    }

    @RequestMapping(value = "register")
    public String register(String username, String password) {
        AdmUser user = new AdmUser();
        user.setName(username);
        user.setPassword(password);
        userService.save(user);
        return "redirect:/l/tologin";
    }

    @RequestMapping(value = "/logout")
    public String logout() {
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/l/tologin";
    }
}
