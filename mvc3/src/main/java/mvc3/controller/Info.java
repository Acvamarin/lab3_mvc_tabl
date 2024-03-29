package mvc3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Info {
	@GetMapping("info")
	public String greeting(ModelMap map) {
		map.addAttribute("Курс", "3");
		map.addAttribute("Группа", "ИТ-4");
		map.addAttribute("Имя", "Кирилл Макавчик");
		return "info";
	}
}
