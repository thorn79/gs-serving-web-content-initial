package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController 
{

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) 
    {
        model.addAttribute("name", name);
        return "greeting";
    }
    
   /* @RequestMapping("/test")
    public String test(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) 
    {
        model.addAttribute("name", name);
        return "test";
    }*/
    
    @RequestMapping("/test")
    public ModelAndView test() 
    {
    	ModelAndView model = new ModelAndView ("test");
    	model.addObject("msg", "test");
    	
    	return model;
    	
    }
    
}

    

