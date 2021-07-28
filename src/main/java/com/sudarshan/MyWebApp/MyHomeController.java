package com.sudarshan.MyWebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*This is used spring framework request map to a controller (auto configuration)*/
@Controller
public class MyHomeController {
/*Dispatcher servlet send request to request mapping with specific "home" request */
    @RequestMapping("home")
    public ModelAndView home(Alien alien){
        ModelAndView mv = new ModelAndView("home");//Tomcat jasper jar is used to display jsp page
        mv.addObject("obj",alien);
        return mv;
    }
}
