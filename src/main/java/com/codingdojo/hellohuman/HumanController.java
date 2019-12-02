package com.codingdojo.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   /// @controller for rending template to user to view
public class HumanController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery,  Model model) {
        if(searchQuery != null){
//            model.addAttribute("name", searchQuery);
            return "index.jsp";
        }
        else
        	model.addAttribute("name", "Human");
        	return "index.jsp";
	}
}