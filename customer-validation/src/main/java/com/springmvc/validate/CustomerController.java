package com.springmvc.validate;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CustomerController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String viewLogin(Map<String, Object> model) {
        Customer user = new Customer();
        model.put("userForm", user);
        return "Login";
    }
 
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@Valid @ModelAttribute("userForm") Customer userForm,
            BindingResult result, Map<String, Object> model) {
 
        if (result.hasErrors()) {
            return "Login";
        }
 
        return "success";
    }

}
