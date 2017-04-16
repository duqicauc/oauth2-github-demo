package com.dqvoice.spring.oauth.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

/**
 * 作用:
 * User: duqi
 * Date: 2017/4/16
 * Time: 15:06
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(Principal principal, Model model) {
        if(principal == null ){
            return "index";
        }
        System.out.println(principal.toString());
        model.addAttribute("principal", principal);
        return "index";
    }

    @GetMapping("/403")
    public String accesssDenied() {
        return "403";
    }
}
