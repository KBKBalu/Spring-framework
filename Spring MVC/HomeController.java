package balu.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/show")
	public ModelAndView showView(){
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("HomePage");
		return mav;
	}
	
	/*@RequestMapping(value="/show",method=RequestMethod.POST)
	public ModelAndView showView1(){
		
		return null;
	}*/
	
	
}
