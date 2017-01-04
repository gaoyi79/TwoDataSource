package mysqlpackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MySqlControl {
	
	@Autowired
	private TestObjectService service;
	
	@RequestMapping(value = "/mysql")
	public ModelAndView getPage()
	{
		ModelAndView mv = new ModelAndView();
		
		List<TestObject> objs = service.findAll();
		mv.setViewName("mysql1");
		mv.addObject("objs", objs);
		return mv;
}
}
