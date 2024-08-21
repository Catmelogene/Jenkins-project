package com.CI.CD.pipeline.XYZ.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/hello")
    public String display()
    {
        return "Index";
    }

}
