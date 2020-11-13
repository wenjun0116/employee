package com.qiufeng.controller;

import com.qiufeng.domain.Employee;
import com.qiufeng.service.CityService;
import com.qiufeng.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 员工管理接口
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView loginView(){
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam(value = "name",required = false)String name,
                        @RequestParam(value = "password",required = false)String password,
                        Model model){
        Employee login = employeeService.login(name, password);
        if (login == null){
            model.addAttribute("message","账号或密码错误！");
            return "/login";
        }
        return "/index";
    }

}
