package mysqlpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MySqlControl {
	
	@Autowired
	TestObjectRepository entityRepository;
	
	@RequestMapping(value = "/mysql")
	public ModelAndView getPage()
	{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("mysql1");
		return mv;
}
}
