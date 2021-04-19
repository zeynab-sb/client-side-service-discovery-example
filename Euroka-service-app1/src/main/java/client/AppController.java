package client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @RequestMapping(value="/process", method = RequestMethod.GET)
    public @ResponseBody String  showLoginPage(ModelMap model){
        return "Processing aap1";
    }
}